package com.unab.g53sql.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuarios") 
public class Usuarios {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "usuario", nullable = false, unique = true, length = 45)
    private String usuario;
    
    @Column(name = "contrasenia", nullable = false, length = 100)
    private String contrasenia;
    
    @Column(name = "estado", nullable = false)
    private boolean estado;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "persona_id", nullable = false)
    private Personas personaId;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "rol_id", nullable = false)
    private Roles RolId;

  //Encapsulamiento
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Personas getPersonaId() {
		return personaId;
	}

	public void setPersonaId(Personas personaId) {
		this.personaId = personaId;
	}

	public Roles getRolId() {
		return RolId;
	}

	public void setRolId(Roles rolId) {
		RolId = rolId;
	}
    
}
