package com.veterinaria.veterinaria.Repository;

import com.veterinaria.veterinaria.Entity.Adoptante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdoptanteRepository extends JpaRepository<Adoptante, Integer> {

}
