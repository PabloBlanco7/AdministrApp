package com.example.AdministracionConjuntoMongoNoSql.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AdministracionConjuntoMongoNoSql.Collection.DatosConjuntos;
import com.example.AdministracionConjuntoMongoNoSql.IRepository.IDatosConjuntosRepository;
import com.example.AdministracionConjuntoMongoNoSql.IService.IDatosConjuntosService;



@Service
public class DatosConjuntosService implements IDatosConjuntosService{

	@Autowired
	private IDatosConjuntosRepository repository;//asociacion
	
	@Override
	public List<DatosConjuntos> all() {
		return repository.findAll();
	}

	@Override
	public Optional<DatosConjuntos> findById(String id) {		
		return repository.findById(id);
	}

	@Override
	public DatosConjuntos save(DatosConjuntos datosConjuntos) {
		return repository.save(datosConjuntos);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
	}
}
