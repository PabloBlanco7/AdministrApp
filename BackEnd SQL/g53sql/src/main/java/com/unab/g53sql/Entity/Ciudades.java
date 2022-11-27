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
@Table(name = "Ciudades") 
public class Ciudades {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "codigo", nullable = false, unique = true, length = 45)
    private String codigo;
    
    @Column(name = "nombre", nullable = false, unique = true, length = 100)
    private String nombre;
    
    @Column(name = "estado", nullable = false)
    private boolean estado;
        
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "departamento_id", nullable = false)
    private Departamentos departamentoId;
    
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
