package com.example.AdministracionConjuntoMongoNoSql.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.AdministracionConjuntoMongoNoSql.Collection.Bitacoras;

public interface IBitacorasRepository extends MongoRepository<Bitacoras, String>{

}
