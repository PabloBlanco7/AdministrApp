package com.unab.g53sql.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unab.g53sql.Entity.Personas;

public interface IPersonasRepository extends JpaRepository<Personas, Integer>{

}
