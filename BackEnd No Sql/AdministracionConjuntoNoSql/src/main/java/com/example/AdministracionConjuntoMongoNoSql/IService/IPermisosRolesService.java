package com.example.AdministracionConjuntoMongoNoSql.IService;

import java.util.List;
import java.util.Optional;

import com.example.AdministracionConjuntoMongoNoSql.Collection.PermisosRoles;


public interface IPermisosRolesService {

	public List<PermisosRoles> all();

	public Optional<PermisosRoles> findById(String id);

	public PermisosRoles save(PermisosRoles permisosRoles);

	public void delete(String id);
}
