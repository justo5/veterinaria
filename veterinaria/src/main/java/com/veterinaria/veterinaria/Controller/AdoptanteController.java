package com.veterinaria.veterinaria.Controller;

import com.veterinaria.veterinaria.DTOS.AdoptanteRequest;
import com.veterinaria.veterinaria.DTOS.AdoptanteResponses;
import com.veterinaria.veterinaria.Entity.Adoptante;
import com.veterinaria.veterinaria.Mappers.AdoptanteMapper;
import com.veterinaria.veterinaria.Services.AdoptanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adoptante")
class AdoptanteController {

    @Autowired
    private AdoptanteService adoptanteService;

    @Autowired
    private AdoptanteMapper adoptanteMapper;

    @PostMapping("/create")
    public ResponseEntity<AdoptanteResponses> crearAdoptante(@RequestBody AdoptanteRequest adoptanteRequest) {
        Adoptante adoptante = AdoptanteMapper.toEntity(adoptanteRequest); // Convertir DTO a entidad
        Adoptante savedAdoptante = adoptanteService.save(adoptante); // Guardar la adoptante
        AdoptanteResponses response = adoptanteMapper.toResponse(savedAdoptante); // Convertir entidad a DTO
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AdoptanteResponses> obtenerAdoptantePorId(@PathVariable Integer id) {
        Adoptante adoptante = adoptanteService.findById(id)
                .orElseThrow(() -> new RuntimeException("Adoptante no encontrado"));
        AdoptanteResponses adoptanteObtenido = adoptanteMapper.toResponse(adoptante);
        return ResponseEntity.ok(adoptanteObtenido);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarAdoptante(@PathVariable Integer id) {
        adoptanteService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    }

