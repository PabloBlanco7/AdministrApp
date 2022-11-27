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
@Table(name = "inmuebles") 
public class Inmuebles {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
    @Column(name = "matriculaInmobiliaria", nullable = false, unique = true)
    private String matriculaInmobiliaria;
    
    @Column(name = "estado", nullable = false)
    private boolean estado;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "usuario_duanio_id", nullable = false)
    private Usuarios usuarioDuenioId;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "ciudad_id", nullable = false)
    private Ciudades ciudadId;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "tipo_inmueble_id", nullable = false)
    private TiposInmuebles tipoInmuebleId;
    
  //Encapsulamiento

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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
