package com.example.AdministracionConjuntoMongoNoSql.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.AdministracionConjuntoMongoNoSql.Collection.PermisosRoles;

public interface IPermisosRolesRepository extends MongoRepository<PermisosRoles, String>{

}
