package com.example.AdministracionConjuntoMongoNoSql.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("usuarios")
public class Usuarios {
	@Id
    private String id;
    
    @Field("usuario")
    private String usuario;
    
    @Field("contrasenia")
    private String contrasenia;
    
    @Field("estado")
    private boolean estado;
    
    @DBRef
    private Personas personaId;
    
    @DBRef
    private Roles RolId;
    
  //Encapsulamiento

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
