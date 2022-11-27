package com.unab.g53sql.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.unab.g53sql.Entity.Inmuebles;
import com.unab.g53sql.IService.IInmueblesService;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/estate/estate")
public class InmueblesController {

	@Autowired
	private IInmueblesService service;
		
	@GetMapping
	public List<Inmuebles> all() {
		return service.all();
	}

	@GetMapping("{id}")
	public Optional<Inmuebles> show(@PathVariable Integer id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Inmuebles save(@RequestBody Inmuebles inmuebles) {
		return service.save(inmuebles);
	}

	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Inmuebles update(@PathVariable Integer id, @RequestBody Inmuebles inmuebles) {
		Optional<Inmuebles> op = service.findById(id);

		if (!op.isEmpty()) {
			Inmuebles inmueblesUpdate = op.get();
			inmueblesUpdate.setMatriculaInmobiliaria(inmuebles.getMatriculaInmobiliaria());								
			inmueblesUpdate.setEstado(inmuebles.getEstado());
			inmueblesUpdate.setUsuarioDuenioId(inmuebles.getUsuarioDuenioId());
			inmueblesUpdate.setCiudadId(inmuebles.getCiudadId());	
			inmueblesUpdate.setTipoInmuebleId(inmuebles.getTipoInmuebleId());
			return service.save(inmueblesUpdate);
		}

		return inmuebles;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
}
