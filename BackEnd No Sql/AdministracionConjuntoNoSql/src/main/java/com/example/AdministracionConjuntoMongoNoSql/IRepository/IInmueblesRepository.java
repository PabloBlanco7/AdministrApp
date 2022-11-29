package com.example.AdministracionConjuntoMongoNoSql.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.AdministracionConjuntoMongoNoSql.Collection.Inmuebles;

public interface IInmueblesRepository extends MongoRepository<Inmuebles, String>{

}
