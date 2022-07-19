package com.example.ademo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleados", catalog="usuarios", schema="")
public class User {
	
	@Id
	@Column
	private Integer idempleados;
	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column
	private Integer identificacion;
	@Column
	private String rol;
	@Column
	private Integer nomina;
	
	
	public Integer getIduser() {
		return idempleados;
	}
	
	public void setIduser(Integer idempleado) {
		this.idempleados = idempleado;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public Integer getIdentificacion() {
		return identificacion;
	}
	
	public void setIdentificacion(Integer identificacion) {
		this.identificacion = identificacion;
	}
	
	public String getRol() {
		return rol;
	}
	
	public void setRol(String rol) {
		this.rol = rol;
	}
	
	public Integer getNomina() {
		return nomina;
	}
	
	public void setNomina(Integer nomina) {
		this.nomina = nomina;
	}
	
	
	
	
	
}
