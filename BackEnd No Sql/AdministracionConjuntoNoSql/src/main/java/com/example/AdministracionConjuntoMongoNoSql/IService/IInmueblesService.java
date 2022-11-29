package com.example.AdministracionConjuntoMongoNoSql.IService;

import java.util.List;
import java.util.Optional;

import com.example.AdministracionConjuntoMongoNoSql.Collection.Inmuebles;


public interface IInmueblesService {

	public List<Inmuebles> all();

	public Optional<Inmuebles> findById(String id);

	public Inmuebles save(Inmuebles inmuebles);

	public void delete(String id);
}
