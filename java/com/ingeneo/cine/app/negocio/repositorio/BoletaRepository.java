package com.ingeneo.cine.app.negocio.repositorio;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ingeneo.cine.app.modelo.entidad.Boleta;
import com.ingeneo.cine.app.modelo.entidad.Reserva;

public interface BoletaRepository extends JpaRepository<Boleta, Long> {
	
	public List<Boleta> findByReserva(Reserva reserva);
	
}
