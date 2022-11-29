package com.example.AdministracionConjuntoMongoNoSql.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AdministracionConjuntoMongoNoSql.Collection.Inmuebles;
import com.example.AdministracionConjuntoMongoNoSql.IRepository.IInmueblesRepository;
import com.example.AdministracionConjuntoMongoNoSql.IService.IInmueblesService;



@Service
public class InmueblesService implements IInmueblesService{

	@Autowired
	private IInmueblesRepository repository;//asociacion
	
	@Override
	public List<Inmuebles> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Inmuebles> findById(String id) {		
		return repository.findById(id);
	}

	@Override
	public Inmuebles save(Inmuebles inmuebles) {
		return repository.save(inmuebles);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
	}
}
