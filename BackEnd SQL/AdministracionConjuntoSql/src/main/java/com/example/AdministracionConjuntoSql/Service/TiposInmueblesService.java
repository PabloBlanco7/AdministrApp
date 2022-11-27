package com.example.AdministracionConjuntoSql.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AdministracionConjuntoSql.Entity.TiposInmuebles;
import com.example.AdministracionConjuntoSql.IRepository.ITiposInmueblesRepository;
import com.example.AdministracionConjuntoSql.IService.ITiposInmueblesService;

@Service
public class TiposInmueblesService implements ITiposInmueblesService{

	@Autowired
	private ITiposInmueblesRepository repository;
	
	@Override
	public List<TiposInmuebles> all() {
		return repository.findAll();
	}

	@Override
	public Optional<TiposInmuebles> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public TiposInmuebles save(TiposInmuebles tiposInmuebles) {
		return repository.save(tiposInmuebles);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

	
}
