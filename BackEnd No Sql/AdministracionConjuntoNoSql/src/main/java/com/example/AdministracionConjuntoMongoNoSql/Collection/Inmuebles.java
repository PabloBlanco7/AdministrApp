package com.example.AdministracionConjuntoMongoNoSql.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("inmuebles")
public class Inmuebles {
	@Id
    private String id;
	
    @Field("matriculaInmobiliaria")
    private String matriculaInmobiliaria;
    
    @Field("estado")
    private boolean estado;
    
    @DBRef
    private Usuarios usuarioDuenioId;
    
    @DBRef
    private Ciudades ciudadId;
    
    @DBRef
    private TiposInmuebles tipoInmuebleId;
    
  //Encapsulamiento

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMatriculaInmobiliaria() {
		return matriculaInmobiliaria;
	}

	public void setMatriculaInmobiliaria(String matriculaInmobiliaria) {
		this.matriculaInmobiliaria = matriculaInmobiliaria;
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Usuarios getUsuarioDuenioId() {
		return usuarioDuenioId;
	}

	public void setUsuarioDuenioId(Usuarios usuarioDuenioId) {
		this.usuarioDuenioId = usuarioDuenioId;
	}

	public Ciudades getCiudadId() {
		return ciudadId;
	}

	public void setCiudadId(Ciudades ciudadId) {
		this.ciudadId = ciudadId;
	}

	public TiposInmuebles getTipoInmuebleId() {
		return tipoInmuebleId;
	}

	public void setTipoInmuebleId(TiposInmuebles tipoInmuebleId) {
		this.tipoInmuebleId = tipoInmuebleId;
	}
}
