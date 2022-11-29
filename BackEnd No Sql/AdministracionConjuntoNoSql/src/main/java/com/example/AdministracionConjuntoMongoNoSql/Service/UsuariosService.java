package com.example.AdministracionConjuntoMongoNoSql.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AdministracionConjuntoMongoNoSql.Collection.Usuarios;
import com.example.AdministracionConjuntoMongoNoSql.IRepository.IUsuariosRepository;
import com.example.AdministracionConjuntoMongoNoSql.IService.IUsuariosService;



@Service
public class UsuariosService implements IUsuariosService{
	
	@Autowired
	private IUsuariosRepository repository;//asociacion
	
	@Override
	public List<Usuarios> all() {
		return repository.findAll();
	}

	@Override
	public Optional<Usuarios> findById(String id) {		
		return repository.findById(id);
	}

	@Override
	public Usuarios save(Usuarios usuarios) {
		return repository.save(usuarios);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);
	}

}
