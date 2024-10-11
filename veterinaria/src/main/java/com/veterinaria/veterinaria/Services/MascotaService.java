package com.veterinaria.veterinaria.Services;

import com.veterinaria.veterinaria.Entity.Mascota;
import com.veterinaria.veterinaria.Repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MascotaService {

    @Autowired
    private MascotaRepository mascotaRepository;

    public List<Mascota> findAll(){

        return mascotaRepository.findAll();
    }

    public Optional<Mascota> findById(Integer id) {

        return mascotaRepository.findById(id);
    }

    public Mascota save(Mascota mascota) {

        return mascotaRepository.save(mascota);
    }

    public void deleteById(Integer id) {

        mascotaRepository.deleteById(id);
    }
}
