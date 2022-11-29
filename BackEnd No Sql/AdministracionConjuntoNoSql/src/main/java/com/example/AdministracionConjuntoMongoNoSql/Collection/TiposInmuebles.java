package com.example.AdministracionConjuntoMongoNoSql.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("TiposInmuebles") 
public class TiposInmuebles {

	@Id    
    private String id;
    
    @Field("codigo")
    private String codigo;
    
    @Field("nombre")
    private String nombre;																																													   
       
    @Field("descripcion")
    private String descripcion;
    
    @Field("proveedor")
    private String proveedor;
    
    @Field("proveedor2")
    private String proveedor2;
    
    @Field("estado")
    private boolean	estado;

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
	
}
