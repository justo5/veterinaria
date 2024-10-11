package com.veterinaria.veterinaria.Controller;

import com.veterinaria.veterinaria.DTOS.MascotaRequest;
import com.veterinaria.veterinaria.DTOS.MascotaResponses;
import com.veterinaria.veterinaria.Entity.Mascota;
import com.veterinaria.veterinaria.Mappers.MascotaMapper;
import com.veterinaria.veterinaria.Services.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/mascotas") //Mapeamos las solicitudes de Mascota
public class MascotaController {

    @Autowired
    private MascotaService mascotaService;

    @Autowired
    private MascotaMapper mascotaMapper;

    @PostMapping("/create")
    public ResponseEntity<MascotaResponses> crearMascota(@RequestBody MascotaRequest mascotaRequest) {
        Mascota mascota = mascotaMapper.toEntity(mascotaRequest); // Convertir DTO a entidad
        Mascota savedMascota = mascotaService.save(mascota); // Guardar la mascota
        MascotaResponses response = mascotaMapper.toResponse(savedMascota); // Convertir entidad a DTO
        return ResponseEntity.ok(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MascotaResponses> obtenerMascotaPorId(@PathVariable Integer id) {
        Mascota mascota = mascotaService.findById(id)
                .orElseThrow(() -> new RuntimeException("Mascota no encontrada"));
        MascotaResponses mascotaObtenida = mascotaMapper.toResponse(mascota);
        return ResponseEntity.ok(mascotaObtenida);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarMascota(@PathVariable Integer id) {
        mascotaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}



