package com.example.AdministracionConjuntoMongoNoSql.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("Bitacoras")
public class Bitacoras {
	
	@Id
    private String id;
    
    @Field("codigo")
    private String codigo;
    
    @Field("descripcion")
    private String descripcion;
    
    @Field("estado")
    private boolean estado;
        
    @DBRef
    private Inmuebles inmuebleId;
    
  //Encapsulamiento

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Inmuebles getInmuebleId() {
		return inmuebleId;
	}

	public void setInmuebleId(Inmuebles inmuebleId) {
		this.inmuebleId = inmuebleId;
	}
}
