package com.veterinaria.veterinaria.Repository;

import com.veterinaria.veterinaria.Entity.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Integer> {


    List<Mascota> findByEspecie(String especie);

    List<Mascota> findByEstado(boolean estado);

}
