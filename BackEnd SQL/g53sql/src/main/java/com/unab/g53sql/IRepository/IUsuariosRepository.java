package com.unab.g53sql.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.unab.g53sql.Entity.Usuarios;

public interface IUsuariosRepository extends JpaRepository<Usuarios, Integer>{

}
