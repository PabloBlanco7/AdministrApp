package com.unab.g53sql.Entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "permisos_roles") 
public class PermisosRoles {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "permiso_id", nullable = false)
    private Permisos permisoId;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "rol_id", nullable = false)
    private Roles rolId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
