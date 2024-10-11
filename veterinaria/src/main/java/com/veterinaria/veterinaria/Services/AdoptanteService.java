package com.veterinaria.veterinaria.Services;

import com.veterinaria.veterinaria.Entity.Adoptante;
import com.veterinaria.veterinaria.Repository.AdoptanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AdoptanteService {

    @Autowired
    private AdoptanteRepository adoptanteRepository;

    public List<Adoptante> findAll() {
        return adoptanteRepository.findAll();
    }

    //Optional en el método findById que ayuda a manejar la posibilidad de que no se encuentre un recurso. Si llamamos a findById y no existe un Adoptante con el ID proporcionado, Optional permite evitar excepciones NullPointerException
    public Optional<Adoptante> findById(Integer id) {
        return adoptanteRepository.findById(id);
    }

    public Adoptante save(Adoptante adoptante) {
        return adoptanteRepository.save(adoptante);
    }

    public void deleteById(Integer id) {
        adoptanteRepository.deleteById(id);
    }
}
