package com.example.domain;

public class Ciudad {
	
	private int id;
	private String ciudad;
	private int precio;
	private int idPais;
	
	public int getId(){
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getIdPais() {
		return idPais;
	}
	public void setIdPais(int idPais) {
		this.idPais = idPais;
	}
	
}