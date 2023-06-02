package com.curso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.HotelDao;
import com.curso.model.Hotel;
/**
 * Clase que implementa el service: HotelesServiceImpl
 * @author Daniel Rodriguez
 * @version 1.0.0 02-06-2023
 */
@Service
public class HotelesServiceImpl implements HotelesService {
	@Autowired
	HotelDao dao;
	@Override
	public List<Hotel> hoteles() {
		return dao.findAll();
	}
	
	@Override
	public Hotel buscarHotel(String nombre) {
		Hotel hotel=dao.buscarHotelPorNombre(nombre);
		return hotel;
	}

	@Override
	public void actualizarHotel(int idHotel, boolean disponible) {
		Hotel hotel=dao.findById(idHotel).orElse(null);
		if(hotel!=null) {
			hotel.setDisponible(disponible);
			dao.save(hotel);
		}
	}

}
