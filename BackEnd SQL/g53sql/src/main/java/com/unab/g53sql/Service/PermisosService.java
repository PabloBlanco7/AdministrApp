package com.unab.g53sql.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.g53sql.Entity.Permisos;
import com.unab.g53sql.IRepository.IPermisosRepository;
import com.unab.g53sql.IService.IPermisosService;

@Service
public class PermisosService implements IPermisosService{

	@Autowired
	private IPermisosRepository repository;//asociacion
	
	@Override
	public List<Permisos> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Permisos> findById(Integer id) {		
		return repository.findById(id);
	}

	@Override
	public Permisos save(Permisos permisos) {
		return repository.save(permisos);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}
}
