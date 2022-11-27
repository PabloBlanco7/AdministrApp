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
@Table(name = "Bitacoras") 
public class Bitacoras {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "codigo", nullable = false, unique = true, length = 45)
    private String codigo;
    
    @Column(name = "descripcion", nullable = false, length = 100)
    private String descripcion;
    
    @Column(name = "estado", nullable = false)
    private boolean estado;
        
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "inmueble_id", nullable = false)
    private Inmuebles inmuebleId;

  //Encapsulamiento
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
