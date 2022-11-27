package com.unab.g53sql.IService;

import java.util.List;
import java.util.Optional;

import com.unab.g53sql.Entity.TiposInmuebles;

public interface ITiposInmueblesService {
	
	public List<TiposInmuebles> all();

	public Optional<TiposInmuebles> findById(Integer id);

	public TiposInmuebles save(TiposInmuebles tiposInmuebles);

	public void delete(Integer id);
}
