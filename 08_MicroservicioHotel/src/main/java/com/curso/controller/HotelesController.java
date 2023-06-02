package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Hotel;
import com.curso.service.HotelesService;
/**
 * Clase controlador: HotelesController
 * @author Daniel Rodriguez
 * @version 1.0.0 02-06-2023
 */
@RestController
public class HotelesController {
	@Autowired
	HotelesService service;
	@GetMapping(value="hoteles",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Hotel> hoteles() {
		return service.hoteles();
	}
	@GetMapping(value="hotel/{nombre}",produces = MediaType.APPLICATION_JSON_VALUE)
	public Hotel buscarHotel(@PathVariable("nombre")String nombre) {
		return service.buscarHotel(nombre);
	}
	@PutMapping(value="hotel/{idHotel}/{disponible}")
	public void actualizarHotel(@PathVariable("idHotel") int idHotel,@PathVariable("disponible") boolean disponible) {
		service.actualizarHotel(idHotel, disponible);
	}
}
