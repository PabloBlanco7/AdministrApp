package com.unab.g53sql.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "permisos") 
public class Permisos {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
        
    @Column(name = "nombre", nullable = false, unique = true, length = 100)
    private String nombre;																																													   
       
    @Column(name = "descripcion", nullable = false, length = 100)
    private String descripcion;
    
    @Column(name = "estado", nullable = false)
    private boolean	estado;
    
    @Column(name = "ruta", nullable = false,unique = true, length = 100)
    private String ruta;
    
    //Encapsulamiento

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	} 
    
}
