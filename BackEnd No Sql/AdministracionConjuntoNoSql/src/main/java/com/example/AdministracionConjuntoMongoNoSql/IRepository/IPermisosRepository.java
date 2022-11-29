package com.example.AdministracionConjuntoMongoNoSql.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.AdministracionConjuntoMongoNoSql.Collection.Permisos;

public interface IPermisosRepository extends MongoRepository<Permisos, String>{

}
