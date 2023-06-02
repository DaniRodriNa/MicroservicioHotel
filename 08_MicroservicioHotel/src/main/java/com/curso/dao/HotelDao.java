package com.curso.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.curso.model.Hotel;
/**
 * Interfaz dao: HotelDao
 * @author Daniel Rodriguez
 * @version 1.0.0 02-06-2023
 */
public interface HotelDao extends JpaRepository<Hotel, Integer> {
	@Query(value="select * from agencia.hoteles  where nombre like '?'",nativeQuery = true)
	public Hotel buscarHotelPorNombre(String nombre);
}
