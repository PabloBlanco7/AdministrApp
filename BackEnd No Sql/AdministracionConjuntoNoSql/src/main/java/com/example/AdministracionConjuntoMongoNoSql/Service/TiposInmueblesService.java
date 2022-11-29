package com.example.AdministracionConjuntoMongoNoSql.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AdministracionConjuntoMongoNoSql.Collection.TiposInmuebles;
import com.example.AdministracionConjuntoMongoNoSql.IRepository.ITiposInmueblesRepository;
import com.example.AdministracionConjuntoMongoNoSql.IService.ITiposInmueblesService;

@Service
public class TiposInmueblesService implements ITiposInmueblesService{
	
	@Autowired
	private ITiposInmueblesRepository repository;
	
	@Override
	public List<TiposInmuebles> all() {
		return repository.findAll();
	}

	@Override
	public Optional<TiposInmuebles> findById(String id) {
		return repository.findById(id);
	}

	@Override
	public TiposInmuebles save(TiposInmuebles tiposInmuebles) {
		return repository.save(tiposInmuebles);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);		
	}
	
}
