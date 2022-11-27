package com.example.AdministracionConjuntoSql.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AdministracionConjuntoSql.Entity.CostesAdministraciones;
import com.example.AdministracionConjuntoSql.IRepository.ICostesAdministracionesRepository;
import com.example.AdministracionConjuntoSql.IService.ICostesAdministracionesService;


@Service
public class CostesAdministracionesService implements ICostesAdministracionesService{

	@Autowired
	private ICostesAdministracionesRepository repository;
	
	@Override
	public List<CostesAdministraciones> all() {
		return repository.findAll();
	}

	@Override
	public Optional<CostesAdministraciones> findById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public CostesAdministraciones save(CostesAdministraciones costesAdministraciones) {
		return repository.save(costesAdministraciones);
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}
	
}
