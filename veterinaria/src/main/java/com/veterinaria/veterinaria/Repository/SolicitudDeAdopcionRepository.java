package com.veterinaria.veterinaria.Repository;

import com.veterinaria.veterinaria.Entity.SolicitudDeAdopcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface SolicitudDeAdopcionRepository extends JpaRepository<SolicitudDeAdopcion, Integer> {


    List<SolicitudDeAdopcion> findByFecha(Date fecha);

    List<SolicitudDeAdopcion> findByEstado(boolean estado);

}
