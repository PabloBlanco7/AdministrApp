package com.unab.g53sql.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.g53sql.Entity.Inmuebles;
import com.unab.g53sql.IRepository.IInmueblesRepository;
import com.unab.g53sql.IService.IInmueblesService;

@Service
public class InmueblesService implements IInmueblesService{

	@Autowired
	private IInmueblesRepository repository;//asociacion
	
	@Override
	public List<Inmuebles> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Inmuebles> findById(Integer id) {		
		return repository.findById(id);
	}

	@Override
	public Inmuebles save(Inmuebles inmuebles) {
		return repository.save(inmuebles);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}
}
