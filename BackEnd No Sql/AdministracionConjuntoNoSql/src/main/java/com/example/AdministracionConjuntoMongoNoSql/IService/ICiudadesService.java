package com.example.AdministracionConjuntoMongoNoSql.IService;

import java.util.List;
import java.util.Optional;

import com.example.AdministracionConjuntoMongoNoSql.Collection.Ciudades;

public interface ICiudadesService {

	public List<Ciudades> all();

	public Optional<Ciudades> findById(String id);

	public Ciudades save(Ciudades ciudades);

	public void delete(String id);
}
