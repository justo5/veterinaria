package com.veterinaria.veterinaria.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Mascota {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id ;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "estado",length = 50,nullable = false)
    private boolean estado;

    @Column(name ="especie",length = 100,nullable = false)
    private String especie;

    public Mascota(int id, String nombre, boolean estado, String especie) {

        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
        this.especie = especie;
    }

    public Mascota(){}


    public boolean getEstado() {
        return false;
    }
}

