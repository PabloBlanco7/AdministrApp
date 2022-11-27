package com.example.AdministracionConjuntoSql.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AdministracionConjuntoSql.Entity.CostesAdministraciones;

public interface ICostesAdministracionesRepository extends JpaRepository<CostesAdministraciones, Integer> {

}
