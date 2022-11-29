package com.example.AdministracionConjuntoMongoNoSql.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("permisosRoles")
public class PermisosRoles {
	@Id
    private String id;
    
    @DBRef
    private Permisos permisoId;
    
    @DBRef
    private Roles rolId;
    
    //Encapsulamiento

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Permisos getPermisoId() {
		return permisoId;
	}

	public void setPermisoId(Permisos permisoId) {
		this.permisoId = permisoId;
	}

	public Roles getRolId() {
		return rolId;
	}

	public void setRolId(Roles rolId) {
		this.rolId = rolId;
	}
}
