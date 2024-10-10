package com.veterinaria.veterinaria.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class SolicitudDeAdopcion {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "fecha", length = 50, nullable = false)
    private Date fecha;

    @Column(name = "estado", length = 100, nullable = false)
    private String estado;

    @Column(name = "mascota", length = 50, nullable = false)
    private Mascota mascota;

    @Column(name = "adoptante", length = 50, nullable = false)
    private Adoptante adoptante;

    public SolicitudDeAdopcion(int id, Date fecha, String estado, Mascota mascota, Adoptante adoptante) {
        this.id = id;
        this.fecha = fecha;
        this.estado = estado;
        this.mascota = mascota;
        this.adoptante = adoptante;
    }

    public SolicitudDeAdopcion() {

    }
}
