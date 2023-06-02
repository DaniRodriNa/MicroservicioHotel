package com.curso.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
/**
 * Clase modelo: Hotel
 * @author Daniel Rodriguez
 * @version 1.0.0 02-06-2023
 */
@Entity
@Table(name="hoteles")
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idHotel;
	private String nombre;
	private String categoria;
	private double precio;
	private boolean disponible;
	public Hotel() {
	}
	public Hotel(int idHotel, String nombre, String categoria, double precio, boolean disponible) {
		this.idHotel = idHotel;
		this.nombre = nombre;
		this.categoria = categoria;
		this.precio = precio;
		this.disponible = disponible;
	}
	public int getIdHotel() {
		return idHotel;
	}
	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isDisponible() {
		return disponible;
	}
	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
}
