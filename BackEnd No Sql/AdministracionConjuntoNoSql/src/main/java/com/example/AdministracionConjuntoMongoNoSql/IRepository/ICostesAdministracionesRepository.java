package com.example.AdministracionConjuntoMongoNoSql.IRepository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.AdministracionConjuntoMongoNoSql.Collection.CostesAdministraciones;

public interface ICostesAdministracionesRepository extends MongoRepository<CostesAdministraciones, String>{

}
