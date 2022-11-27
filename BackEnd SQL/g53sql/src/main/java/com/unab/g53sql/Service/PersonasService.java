package com.unab.g53sql.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.g53sql.Entity.Personas;
import com.unab.g53sql.IRepository.IPersonasRepository;
import com.unab.g53sql.IService.IPersonasService;

@Service
public class PersonasService implements IPersonasService{
	
	@Autowired
	private IPersonasRepository repository;//asociacion
	
	@Override
	public List<Personas> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Personas> findById(Integer id) {		
		return repository.findById(id);
	}

	@Override
	public Personas save(Personas personas) {
		return repository.save(personas);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

}
