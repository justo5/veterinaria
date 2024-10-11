package com.veterinaria.veterinaria.Mappers;

import com.veterinaria.veterinaria.DTOS.MascotaRequest;
import com.veterinaria.veterinaria.DTOS.MascotaResponses;
import com.veterinaria.veterinaria.Entity.Mascota;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class MascotaMapper {


    // Convierte una Mascota en un MascotaResponses para enviar los datos al cliente en la respuesta HTTP.
    public MascotaResponses toResponse(Mascota mascota) {
        MascotaResponses response = new MascotaResponses();
        response.setId(mascota.getId());
        response.setNombre(mascota.getNombre());
        response.setEstado(mascota.getEstado());
        response.setEspecie(mascota.getEspecie());
        return response;
    }


    // Convierte un MascotaRequest en una Mascota para que pueda ser guardada o procesada en el sistema.
    public Mascota toEntity(MascotaRequest request) {
        Mascota mascota;
        mascota = new Mascota();
        mascota.setNombre(request.getNombre());
        mascota.setEstado(request.getEstado());
        mascota.setEspecie(request.getEspecie());
        return mascota;
    }
}

