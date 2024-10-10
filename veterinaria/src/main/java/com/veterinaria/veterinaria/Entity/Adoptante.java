package com.veterinaria.veterinaria.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Adoptante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "apellido", length = 50, nullable = false)
    private String apellido;

    @Column(name = "dni", length = 20, nullable = false)
    private int dni;

    @Column(name = "telefono", length = 20, nullable = false)
    private int telefono;

    @Column(name = "email", length = 50, nullable = false)
    private String email;

    public Adoptante(int id, String nombre, String apellido, int dni, int telefono, String email) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
    }

    public Adoptante() {

    }
}
