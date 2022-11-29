package com.example.AdministracionConjuntoMongoNoSql.IService;

import java.util.List;
import java.util.Optional;

import com.example.AdministracionConjuntoMongoNoSql.Collection.Bitacoras;

public interface IBitacorasService {

	public List<Bitacoras> all();

	public Optional<Bitacoras> findById(String id);

	public Bitacoras save(Bitacoras bitacoras);

	public void delete(String id);
}
