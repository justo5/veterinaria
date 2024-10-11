package com.veterinaria.veterinaria.Mappers;



import com.veterinaria.veterinaria.DTOS.AdoptanteRequest;
import com.veterinaria.veterinaria.DTOS.AdoptanteResponses;
import com.veterinaria.veterinaria.Entity.Adoptante;
import org.springframework.stereotype.Component;

@Component
public class AdoptanteMapper {

    public AdoptanteResponses toResponse(Adoptante adoptante) {

        AdoptanteResponses response = new AdoptanteResponses();
        response.setId(adoptante.getId());
        response.setNombre(adoptante.getNombre());
        response.setApellido(adoptante.getApellido());
        response.setDni(adoptante.getDni());
        response.setTelefono(adoptante.getTelefono());
        response.setEmail(adoptante.getEmail());
        return response;
    }

    public static Adoptante toEntity(AdoptanteRequest request) {

        Adoptante adoptante = new Adoptante();
        adoptante.setNombre(request.getNombre());
        adoptante.setApellido(request.getApellido());
        adoptante.setDni(request.getDni());
        adoptante.setTelefono(request.getTelefono());
        adoptante.setEmail(request.getEmail());
        return adoptante;
    }
}

