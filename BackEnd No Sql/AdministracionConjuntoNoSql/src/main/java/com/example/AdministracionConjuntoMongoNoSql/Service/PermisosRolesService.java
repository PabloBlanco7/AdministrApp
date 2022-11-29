package com.example.AdministracionConjuntoMongoNoSql.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AdministracionConjuntoMongoNoSql.Collection.PermisosRoles;
import com.example.AdministracionConjuntoMongoNoSql.IRepository.IPermisosRolesRepository;
import com.example.AdministracionConjuntoMongoNoSql.IService.IPermisosRolesService;



@Service
public class PermisosRolesService implements IPermisosRolesService{

	@Autowired
	private IPermisosRolesRepository repository;//asociacion
	
	@Override
	public List<PermisosRoles> all() {
		return repository.findAll();
	}

	@Override
	public Optional<PermisosRoles> findById(String id) {		
		return repository.findById(id);
	}

	@Override
	public PermisosRoles save(PermisosRoles permisosRoles) {
		return repository.save(permisosRoles);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
	}
}
