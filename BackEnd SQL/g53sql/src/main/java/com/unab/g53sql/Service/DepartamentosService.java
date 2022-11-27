package com.unab.g53sql.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.g53sql.Entity.Departamentos;
import com.unab.g53sql.IRepository.IDepartamentosRepository;
import com.unab.g53sql.IService.IDepartamentosService;

@Service
public class DepartamentosService implements IDepartamentosService{
	
	@Autowired
	private IDepartamentosRepository repository;//asociacion
	
	@Override
	public List<Departamentos> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Departamentos> findById(Integer id) {		
		return repository.findById(id);
	}

	@Override
	public Departamentos save(Departamentos departamentos) {
		return repository.save(departamentos);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}
}
