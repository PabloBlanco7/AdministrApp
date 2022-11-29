package com.example.AdministracionConjuntoMongoNoSql.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("Ciudades")
public class Ciudades {
	
	@Id
    private String id;
    
    @Field("codigo")
    private String codigo;
    
    @Field("nombre")
    private String nombre;
    
    @Field("estado")
    private boolean estado;
        
    @DBRef
    private Departamentos departamentoId;
    
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Departamentos getDepartamentoId() {
		return departamentoId;
	}

	public void setDepartamentoId(Departamentos departamentoId) {
		this.departamentoId = departamentoId;
	}
}
