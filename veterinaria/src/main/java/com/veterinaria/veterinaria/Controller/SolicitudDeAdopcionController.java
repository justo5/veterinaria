package com.veterinaria.veterinaria.Controller;

import com.veterinaria.veterinaria.DTOS.SolicitudDeAdopcionRequest;
import com.veterinaria.veterinaria.DTOS.SolicitudDeAdopcionResponses;
import com.veterinaria.veterinaria.Entity.SolicitudDeAdopcion;
import com.veterinaria.veterinaria.Mappers.SolicitudDeAdopcionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.veterinaria.veterinaria.Services.SolicitudDeAdopcionService;

//import java.util.Optional;

@RestController
@RequestMapping("/solicitudes")
public class SolicitudDeAdopcionController {

    @Autowired
    private SolicitudDeAdopcionService solicitudDeAdopcionService;

    @Autowired
    private SolicitudDeAdopcionMapper solicitudDeAdopcionMapper;

    @PostMapping("/create")
    public ResponseEntity<SolicitudDeAdopcion> crearSolicitud(@RequestBody SolicitudDeAdopcionRequest solicitudDeAdopcionRequest) {
        SolicitudDeAdopcion solicitudDeAdopcion = solicitudDeAdopcionMapper.toEntity(solicitudDeAdopcionRequest);
        SolicitudDeAdopcion savedSolicitud = solicitudDeAdopcionService.save(solicitudDeAdopcion);
        SolicitudDeAdopcion response = solicitudDeAdopcionMapper.toResponse(savedSolicitud);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
    @GetMapping("/{id}")
    public ResponseEntity<SolicitudDeAdopcionResponses> obtenerSolicitudPorId(@PathVariable Integer id) {
        SolicitudDeAdopcion solicitudDeAdopcion = solicitudDeAdopcionService.findById(id)
                .orElseThrow(() -> new RuntimeException("Solicitud no encontrada"));
        SolicitudDeAdopcionResponses solicitudObtenida = solicitudDeAdopcionMapper.toResponse(solicitudDeAdopcion);
        return ResponseEntity.ok(solicitudObtenida);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarSolicitud(@PathVariable Integer id) {
        solicitudDeAdopcionService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

}
