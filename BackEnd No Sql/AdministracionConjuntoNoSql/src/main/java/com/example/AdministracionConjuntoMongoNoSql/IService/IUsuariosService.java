package com.example.AdministracionConjuntoMongoNoSql.IService;

import java.util.List;
import java.util.Optional;

import com.example.AdministracionConjuntoMongoNoSql.Collection.Usuarios;

public interface IUsuariosService {

	public List<Usuarios> all();

	public Optional<Usuarios> findById(String id);

	public Usuarios save(Usuarios usuarios);

	public void delete(String id);
}
