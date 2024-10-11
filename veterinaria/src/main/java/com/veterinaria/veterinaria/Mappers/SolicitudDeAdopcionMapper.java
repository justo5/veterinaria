package com.veterinaria.veterinaria.Mappers;


import com.veterinaria.veterinaria.DTOS.SolicitudDeAdopcionRequest;
import com.veterinaria.veterinaria.DTOS.SolicitudDeAdopcionResponses;
import com.veterinaria.veterinaria.Entity.SolicitudDeAdopcion;
import org.springframework.stereotype.Component;

@Component
public class SolicitudDeAdopcionMapper {

    public SolicitudDeAdopcionResponses toResponse(SolicitudDeAdopcion solicitudDeAdopcion) {

        SolicitudDeAdopcion response = new SolicitudDeAdopcion();
        response.setId(solicitudDeAdopcion.getId());
        response.setFecha(solicitudDeAdopcion.getFecha());
        response.setEstado(solicitudDeAdopcion.getEstado());
        response.setMascota(solicitudDeAdopcion.getMascota());
        response.setAdoptante(solicitudDeAdopcion.getAdoptante());
        return (SolicitudDeAdopcionResponses) response;
    }

    public SolicitudDeAdopcion toEntity(SolicitudDeAdopcionRequest request){

        SolicitudDeAdopcion solicitud = new SolicitudDeAdopcion();
        solicitud.setId(solicitud.getId());
        solicitud.setFecha(solicitud.getFecha());
        solicitud.setEstado(solicitud.getEstado());
        solicitud.setMascota(request.getMascota());
        solicitud.setAdoptante(request.getAdoptante());
        return solicitud;
    }

}
