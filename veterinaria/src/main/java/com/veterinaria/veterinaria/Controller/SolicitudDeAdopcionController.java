package com.veterinaria.veterinaria.Controller;

import com.veterinaria.veterinaria.Mappers.SolicitudDeAdopcionMapper;
import org.springframework.beans.factory.annotation.Autowired;
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

    //@PostMapping
    //@GetMapping("/{id}")
    //@DeleteMapping("/{id}")

}
