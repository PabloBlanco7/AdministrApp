package com.example.AdministracionConjuntoMongoNoSql.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.AdministracionConjuntoMongoNoSql.Collection.Ciudades;

public interface ICiudadesRepository extends MongoRepository<Ciudades, String>{

}
