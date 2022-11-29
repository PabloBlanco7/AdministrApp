package com.example.AdministracionConjuntoMongoNoSql.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.AdministracionConjuntoMongoNoSql.Collection.DatosConjuntos;

public interface IDatosConjuntosRepository extends MongoRepository<DatosConjuntos, String>{

}
