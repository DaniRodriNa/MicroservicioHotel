package com.curso.service;

import java.util.List;

import com.curso.model.Hotel;
/**
 * Interfaz service: HotelesService
 * @author Daniel Rodriguez
 * @version 1.0.0 02-06-2023
 */
public interface HotelesService {
	List<Hotel> hoteles();
	Hotel buscarHotel(String nombre);
	void actualizarHotel(int idHotel,boolean disponible);
}
