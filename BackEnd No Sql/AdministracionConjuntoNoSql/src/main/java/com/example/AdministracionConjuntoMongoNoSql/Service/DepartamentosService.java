package com.example.AdministracionConjuntoMongoNoSql.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AdministracionConjuntoMongoNoSql.Collection.Departamentos;
import com.example.AdministracionConjuntoMongoNoSql.IRepository.IDepartamentosRepository;
import com.example.AdministracionConjuntoMongoNoSql.IService.IDepartamentosService;


@Service
public class DepartamentosService implements IDepartamentosService{
	
	@Autowired
	private IDepartamentosRepository repository;//asociacion
	
	@Override
	public List<Departamentos> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Departamentos> findById(String id) {		
		return repository.findById(id);
	}

	@Override
	public Departamentos save(Departamentos departamentos) {
		return repository.save(departamentos);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
	}
}
