package com.example.AdministracionConjuntoMongoNoSql.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AdministracionConjuntoMongoNoSql.Collection.CostesAdministraciones;
import com.example.AdministracionConjuntoMongoNoSql.IRepository.ICostesAdministracionesRepository;
import com.example.AdministracionConjuntoMongoNoSql.IService.ICostesAdministracionesService;

@Service
public class CostesAdministracionesService  implements ICostesAdministracionesService{

	@Autowired
	private ICostesAdministracionesRepository repository;
	
	@Override
	public List<CostesAdministraciones> all() {
		return repository.findAll();
	}

	@Override
	public Optional<CostesAdministraciones> findById(String id) {
		return repository.findById(id);
	}

	@Override
	public CostesAdministraciones save(CostesAdministraciones costesAdministraciones) {
		return repository.save(costesAdministraciones);
	}

	@Override
	public void delete(String id) {
		repository.deleteById(id);		
	}
}
