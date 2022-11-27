package com.example.AdministracionConjuntoSql.IService;

import java.util.List;
import java.util.Optional;

import com.example.AdministracionConjuntoSql.Entity.CostesAdministraciones;


public interface ICostesAdministracionesService {
	
	public List<CostesAdministraciones> all();

	public Optional<CostesAdministraciones> findById(Integer id);

	public CostesAdministraciones save(CostesAdministraciones costesAdministraciones);

	public void delete(Integer id);

}
