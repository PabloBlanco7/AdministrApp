package com.example.AdministracionConjuntoMongoNoSql.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.AdministracionConjuntoMongoNoSql.Collection.TiposInmuebles;

public interface ITiposInmueblesRepository extends MongoRepository<TiposInmuebles, String>{

}
