package com.misiontic2022.tiendaGenerica.DTO;

public class ClienteVO {
	private Integer cc;
	private String nombre;
	private String direccion;
	private String telefono;
	private String correo;
	
	
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public Integer getCc() {
		return cc;
	}
	public void setCc(Integer cc) {
		this.cc = cc;
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
	
	

}
