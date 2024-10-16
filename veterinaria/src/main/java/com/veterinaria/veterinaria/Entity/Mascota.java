package com.veterinaria.veterinaria.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
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

    public boolean getEstado() {
        return false;
    }
}

