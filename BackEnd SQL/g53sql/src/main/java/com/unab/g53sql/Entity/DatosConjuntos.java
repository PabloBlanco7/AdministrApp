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
@Table(name = "datos_conjuntos") 
public class DatosConjuntos {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
    @Column(name = "codigo", nullable = false, unique = true, length = 45)
    private String codigo;
    
    @Column(name = "nombre", nullable = false, unique = true, length = 80)
    private String nombre;
    
    @Column(name = "direccion", nullable = false, length = 45)
    private String direccion;
    
    @Column(name = "telefono", nullable = false, length = 20)
    private String telefono;
    
    @Column(name = "correo", nullable = false, unique = true, length = 45)
    private String correo;
    
    @Column(name = "estado", nullable = false)
    private boolean estado;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "ciudad_id", nullable = false)
    private Ciudades ciudadId;
    
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "usuario_administrador_id", nullable = false)
    private Usuarios usuarioAdministradorId;
    
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
