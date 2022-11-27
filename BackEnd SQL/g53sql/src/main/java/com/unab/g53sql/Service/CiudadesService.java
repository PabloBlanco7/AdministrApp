package com.unab.g53sql.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.g53sql.Entity.Ciudades;
import com.unab.g53sql.IRepository.ICiudadesRepository;
import com.unab.g53sql.IService.ICiudadesService;

@Service
public class CiudadesService implements ICiudadesService{
	
	@Autowired
	private ICiudadesRepository repository;//asociacion
	
	@Override
	public List<Ciudades> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Ciudades> findById(Integer id) {		
		return repository.findById(id);
	}

	@Override
	public Ciudades save(Ciudades ciudades) {
		return repository.save(ciudades);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

}
