package com.example.AdministracionConjuntoMongoNoSql.Controller;

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

import com.example.AdministracionConjuntoMongoNoSql.Collection.CostesAdministraciones;
import com.example.AdministracionConjuntoMongoNoSql.IService.ICostesAdministracionesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/estate/costManagement")
public class CostesAdministracionesController {

	@Autowired
	private ICostesAdministracionesService service;
	
	
	@GetMapping
	public List<CostesAdministraciones> all() {
		return service.all();
	}

	@GetMapping("{id}")
	public Optional<CostesAdministraciones> show(@PathVariable String id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public CostesAdministraciones save(@RequestBody CostesAdministraciones costesAdministraciones) {
		return service.save(costesAdministraciones);
	}

	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public CostesAdministraciones update(@PathVariable String id, @RequestBody CostesAdministraciones costesAdministraciones) {
		Optional<CostesAdministraciones> op = service.findById(id);

		if (!op.isEmpty()) {
			CostesAdministraciones costesAdministracionesUpdate = op.get();
			costesAdministracionesUpdate.setCodigo(costesAdministraciones.getCodigo());
			costesAdministracionesUpdate.setNombre(costesAdministraciones.getNombre());
			costesAdministracionesUpdate.setValorMes(costesAdministraciones.getValorMes());						
			costesAdministracionesUpdate.setEstado(costesAdministraciones.getEstado());
			costesAdministracionesUpdate.setTipoInmuebleId(costesAdministraciones.getTipoInmuebleId());
			return service.save(costesAdministracionesUpdate);
		}

		return costesAdministraciones;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable String id) {
		service.delete(id);
	}
}
