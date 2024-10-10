package com.veterinaria.veterinaria.Repository;

import com.veterinaria.veterinaria.Entity.SolicitudDeAdopcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SolicitudDeAdopcionRepository extends JpaRepository<SolicitudDeAdopcion, Integer> {

}
