package com.veterinaria.veterinaria.Controller;

import com.veterinaria.veterinaria.Mappers.MascotaMapper;
import com.veterinaria.veterinaria.Services.MascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/mascotas")
public class MascotaController {

    @Autowired
    private MascotaService mascotaService;

    @Autowired
    private MascotaMapper mascotaMapper;



    //@PostMapping
    //@GetMapping("/{id}")
    //@DeleteMapping("/{id}")

}
