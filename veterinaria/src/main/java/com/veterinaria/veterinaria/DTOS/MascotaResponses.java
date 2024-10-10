package com.veterinaria.veterinaria.DTOS;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class MascotaResponses {
    private int id;
    private String nombre;
    private String especie;
    private boolean estado;

}