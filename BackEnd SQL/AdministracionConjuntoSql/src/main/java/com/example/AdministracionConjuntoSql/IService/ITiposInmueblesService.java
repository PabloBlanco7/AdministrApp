package com.example.AdministracionConjuntoSql.IService;

import java.util.List;
import java.util.Optional;

import com.example.AdministracionConjuntoSql.Entity.TiposInmuebles;

public interface ITiposInmueblesService {
	
	public List<TiposInmuebles> all();

	public Optional<TiposInmuebles> findById(Integer id);

	public TiposInmuebles save(TiposInmuebles tiposInmuebles);

	public void delete(Integer id);

}
