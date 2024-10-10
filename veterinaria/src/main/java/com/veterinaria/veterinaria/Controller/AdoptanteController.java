package com.veterinaria.veterinaria.Controller;

import com.veterinaria.veterinaria.Mappers.AdoptanteMapper;
import com.veterinaria.veterinaria.Services.AdoptanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/adoptante")
class AdoptanteController {

    @Autowired
    private AdoptanteService adoptanteService;

    @Autowired
    private AdoptanteMapper adoptanteMapper;

    //@PostMapping // endpoint para crear
    //@GetMapping // endpoint para obtener un adoptante específica mediante su ID.
    //@DeleteMapping // ndpoint para eliminar una adoptante mediante su ID.
    }

