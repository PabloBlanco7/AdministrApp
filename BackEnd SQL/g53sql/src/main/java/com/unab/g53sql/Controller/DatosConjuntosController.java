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

import com.unab.g53sql.Entity.DatosConjuntos;
import com.unab.g53sql.IService.IDatosConjuntosService;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/estate/residenceData")
public class DatosConjuntosController {

	@Autowired
	private IDatosConjuntosService service;
		
	@GetMapping
	public List<DatosConjuntos> all() {
		return service.all();
	}

	@GetMapping("{id}")
	public Optional<DatosConjuntos> show(@PathVariable Integer id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public DatosConjuntos save(@RequestBody DatosConjuntos datosConjuntos) {
		return service.save(datosConjuntos);
	}

	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public DatosConjuntos update(@PathVariable Integer id, @RequestBody DatosConjuntos datosConjuntos) {
		Optional<DatosConjuntos> op = service.findById(id);

		if (!op.isEmpty()) {
			DatosConjuntos datosConjuntosUpdate = op.get();
			datosConjuntosUpdate.setCodigo(datosConjuntos.getCodigo());
			datosConjuntosUpdate.setNombre(datosConjuntos.getNombre());
			datosConjuntosUpdate.setDireccion(datosConjuntos.getDireccion());
			datosConjuntosUpdate.setTelefono(datosConjuntos.getTelefono());
			datosConjuntosUpdate.setCorreo(datosConjuntos.getCorreo());
			datosConjuntosUpdate.setEstado(datosConjuntos.getEstado());
			datosConjuntosUpdate.setCiudadId(datosConjuntos.getCiudadId());
			datosConjuntosUpdate.setUsuarioAdministradorId(datosConjuntos.getUsuarioAdministradorId());
			return service.save(datosConjuntosUpdate);
		}

		return datosConjuntos;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
}
