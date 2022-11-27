package com.unab.g53sql.IService;

import java.util.List;
import java.util.Optional;

import com.unab.g53sql.Entity.Permisos;


public interface IPermisosService {

	public List<Permisos> all();

	public Optional<Permisos> findById(Integer id);

	public Permisos save(Permisos permisos);

	public void delete(Integer id);
}
