package com.veterinaria.veterinaria.Repository;

import com.veterinaria.veterinaria.Entity.Adoptante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdoptanteRepository extends JpaRepository<Adoptante, Integer> {

    List<Adoptante> findByNombre(String nombre);

    List<Adoptante> findByApellido(String apellido);

    List<Adoptante> findByDni(int dni);

}
