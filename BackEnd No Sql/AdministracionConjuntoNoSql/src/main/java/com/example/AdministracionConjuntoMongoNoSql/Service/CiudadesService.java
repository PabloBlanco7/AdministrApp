package com.example.AdministracionConjuntoMongoNoSql.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AdministracionConjuntoMongoNoSql.Collection.Ciudades;
import com.example.AdministracionConjuntoMongoNoSql.IRepository.ICiudadesRepository;
import com.example.AdministracionConjuntoMongoNoSql.IService.ICiudadesService;


@Service
public class CiudadesService implements ICiudadesService{
	
	@Autowired
	private ICiudadesRepository repository;//asociacion
	
	@Override
	public List<Ciudades> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Ciudades> findById(String id) {		
		return repository.findById(id);
	}

	@Override
	public Ciudades save(Ciudades ciudades) {
		return repository.save(ciudades);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
	}

}
