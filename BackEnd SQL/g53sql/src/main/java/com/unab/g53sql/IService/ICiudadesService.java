package com.unab.g53sql.IService;

import java.util.List;
import java.util.Optional;

import com.unab.g53sql.Entity.Ciudades;


public interface ICiudadesService {

	public List<Ciudades> all();

	public Optional<Ciudades> findById(Integer id);

	public Ciudades save(Ciudades ciudades);

	public void delete(Integer id);
}
