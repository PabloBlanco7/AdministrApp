package com.unab.g53sql.Entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "personas") 
public class Personas {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
    @Column(name = "tipoDocumento", nullable = false, length = 45)
    private String tipoDocumento;
    
    @Column(name = "documento", nullable = false, unique = true, length = 12)
    private String documento;
    
    @Column(name = "nombreCompleto", nullable = false, unique = true, length = 80)
    private String nombreCompleto;
    
    @Column(name = "telefono", nullable = false, length = 20)
    private String telefono;
    
    @Column(name = "correo", nullable = false, unique = true, length = 45)
    private String correo;
    
    @Column(name = "fechaNacimiento", nullable = false)
    private String fechaNacimiento;
    
    @Column(name = "direccion", nullable = false)
    private String direccion;
    
    @Column(name = "estado", nullable = false)
    private boolean estado;
    
    //Encapsulamiento

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
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

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
}
