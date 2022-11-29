package com.example.AdministracionConjuntoMongoNoSql.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AdministracionConjuntoMongoNoSql.Collection.Permisos;
import com.example.AdministracionConjuntoMongoNoSql.IRepository.IPermisosRepository;
import com.example.AdministracionConjuntoMongoNoSql.IService.IPermisosService;



@Service
public class PermisosService implements IPermisosService{

	@Autowired
	private IPermisosRepository repository;//asociacion
	
	@Override
	public List<Permisos> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Permisos> findById(String id) {		
		return repository.findById(id);
	}

	@Override
	public Permisos save(Permisos permisos) {
		return repository.save(permisos);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
	}
}
