package com.example.AdministracionConjuntoMongoNoSql.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.AdministracionConjuntoMongoNoSql.Collection.Departamentos;

public interface IDepartamentosRepository extends MongoRepository<Departamentos, String>{

}
