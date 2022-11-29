package com.example.AdministracionConjuntoMongoNoSql.IService;

import java.util.List;
import java.util.Optional;

import com.example.AdministracionConjuntoMongoNoSql.Collection.TiposInmuebles;

public interface ITiposInmueblesService {
	
	public List<TiposInmuebles> all();

	public Optional<TiposInmuebles> findById(String id);

	public TiposInmuebles save(TiposInmuebles tiposInmuebles);

	public void delete(String id);
}
