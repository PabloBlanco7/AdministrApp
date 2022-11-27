package com.example.AdministracionConjuntoSql.Controller;

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

import com.example.AdministracionConjuntoSql.Entity.TiposInmuebles;
import com.example.AdministracionConjuntoSql.IService.ITiposInmueblesService;




@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/estate/propertyType")
public class TiposInmueblesController {
	
	@Autowired
	private ITiposInmueblesService service;
	
	
	@GetMapping
	public List<TiposInmuebles> all() {
		return service.all();
	}

	@GetMapping("{id}")
	public Optional<TiposInmuebles> show(@PathVariable Integer id) {
		return service.findById(id);
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public TiposInmuebles save(@RequestBody TiposInmuebles tiposInmuebles) {
		return service.save(tiposInmuebles);
	}

	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public TiposInmuebles update(@PathVariable Integer id, @RequestBody TiposInmuebles tiposInmuebles) {
		Optional<TiposInmuebles> op = service.findById(id);

		if (!op.isEmpty()) {
			TiposInmuebles tiposInmueblesUpdate = op.get();
			tiposInmueblesUpdate.setCodigo(tiposInmuebles.getCodigo());
			tiposInmueblesUpdate.setNombre(tiposInmuebles.getNombre());					
			tiposInmueblesUpdate.setEstado(tiposInmuebles.getEstado());
			tiposInmueblesUpdate.setDescripcion(tiposInmuebles.getDescripcion());
			return service.save(tiposInmueblesUpdate);
		}

		return tiposInmuebles;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
	
}
