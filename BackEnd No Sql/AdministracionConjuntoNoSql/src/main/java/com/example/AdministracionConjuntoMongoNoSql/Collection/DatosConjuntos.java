package com.example.AdministracionConjuntoMongoNoSql.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("datosConjuntos")
public class DatosConjuntos {
	@Id
    private String id;
	
    @Field("codigo")
    private String codigo;
    
    @Field("nombre")
    private String nombre;
    
    @Field("direccion")
    private String direccion;
    
    @Field("telefono")
    private String telefono;
    
    @Field("correo")
    private String correo;
    
    @Field("estado")
    private boolean estado;
    
    @DBRef
    private Ciudades ciudadId;
    
    @DBRef
    private Usuarios usuarioAdministradorId;

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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Ciudades getCiudadId() {
		return ciudadId;
	}

	public void setCiudadId(Ciudades ciudadId) {
		this.ciudadId = ciudadId;
	}

	public Usuarios getUsuarioAdministradorId() {
		return usuarioAdministradorId;
	}

	public void setUsuarioAdministradorId(Usuarios usuarioAdministradorId) {
		this.usuarioAdministradorId = usuarioAdministradorId;
	}
}
