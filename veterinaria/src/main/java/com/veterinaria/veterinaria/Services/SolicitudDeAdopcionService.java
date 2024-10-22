package com.veterinaria.veterinaria.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.veterinaria.veterinaria.Entity.SolicitudDeAdopcion;
import com.veterinaria.veterinaria.Repository.SolicitudDeAdopcionRepository;


import java.util.List;
import java.util.Optional;

@Service
public class SolicitudDeAdopcionService {

    @Autowired
    private SolicitudDeAdopcionRepository solicitudDeAdopcionRepository;

    private List<SolicitudDeAdopcion> findAll(){

        return solicitudDeAdopcionRepository.findAll();
    }

    public Optional<SolicitudDeAdopcion> findById(Integer id) {


        return solicitudDeAdopcionRepository.findById(id);
    }

    public SolicitudDeAdopcion save(SolicitudDeAdopcion solicitud) {

        return solicitudDeAdopcionRepository.save(solicitud);
    }

    public void deleteById(Integer id) {

        solicitudDeAdopcionRepository.deleteById(id);
    }
}
