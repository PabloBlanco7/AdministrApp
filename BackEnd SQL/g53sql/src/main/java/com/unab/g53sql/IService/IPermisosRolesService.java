package com.unab.g53sql.IService;

import java.util.List;
import java.util.Optional;

import com.unab.g53sql.Entity.PermisosRoles;


public interface IPermisosRolesService {

	public List<PermisosRoles> all();

	public Optional<PermisosRoles> findById(Integer id);

	public PermisosRoles save(PermisosRoles permisosRoles);

	public void delete(Integer id);
}
