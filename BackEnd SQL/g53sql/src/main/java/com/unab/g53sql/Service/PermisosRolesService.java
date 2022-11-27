package com.unab.g53sql.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.g53sql.Entity.PermisosRoles;
import com.unab.g53sql.IRepository.IPermisosRolesRepository;
import com.unab.g53sql.IService.IPermisosRolesService;

@Service
public class PermisosRolesService implements IPermisosRolesService{

	@Autowired
	private IPermisosRolesRepository repository;//asociacion
	
	@Override
	public List<PermisosRoles> all() {
		return repository.findAll();
	}

	@Override
	public Optional<PermisosRoles> findById(Integer id) {		
		return repository.findById(id);
	}

	@Override
	public PermisosRoles save(PermisosRoles permisosRoles) {
		return repository.save(permisosRoles);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}
}
