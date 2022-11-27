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

import com.unab.g53sql.Entity.Bitacoras;
import com.unab.g53sql.IService.IBitacorasService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/estate/binnacle")
public class BitacorasController {
	
	@Autowired
	private IBitacorasService service;
		
	@GetMapping
	public List<Bitacoras> all() {
		return service.all();
	}

	@GetMapping("{id}")
	public Optional<Bitacoras> show(@PathVariable Integer id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Bitacoras save(@RequestBody Bitacoras bitacoras) {
		return service.save(bitacoras);
	}

	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Bitacoras update(@PathVariable Integer id, @RequestBody Bitacoras bitacoras) {
		Optional<Bitacoras> op = service.findById(id);

		if (!op.isEmpty()) {
			Bitacoras bitacorasUpdate = op.get();
			bitacorasUpdate.setCodigo(bitacoras.getCodigo());
			bitacorasUpdate.setDescripcion(bitacoras.getDescripcion());						
			bitacorasUpdate.setEstado(bitacoras.getEstado());
			bitacorasUpdate.setInmuebleId(bitacoras.getInmuebleId());
			return service.save(bitacorasUpdate);
		}

		return bitacoras;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}

}
