package com.example.AdministracionConjuntoMongoNoSql.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AdministracionConjuntoMongoNoSql.Collection.Roles;
import com.example.AdministracionConjuntoMongoNoSql.IRepository.IRolesRepository;
import com.example.AdministracionConjuntoMongoNoSql.IService.IRolesService;



@Service
public class RolesService implements IRolesService{
	
	@Autowired
	private IRolesRepository repository;//asociacion
	
	@Override
	public List<Roles> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Roles> findById(String id) {		
		return repository.findById(id);
	}

	@Override
	public Roles save(Roles roles) {
		return repository.save(roles);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
	}

}
