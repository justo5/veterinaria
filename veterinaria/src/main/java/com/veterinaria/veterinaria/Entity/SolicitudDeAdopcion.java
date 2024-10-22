package com.veterinaria.veterinaria.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name =  "solicitudes de adopcion")
@Entity
public class SolicitudDeAdopcion {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "fecha", length = 50, nullable = false)
    private Date fecha;

    @Column(name = "estado", length = 100, nullable = false)
    private String estado;

    @OneToOne(targetEntity = Mascota.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "mascota_id")
    @Column(name = "mascota", length = 50, nullable = false)
    private Mascota mascota;

    @OneToOne(targetEntity = Adoptante.class, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "adoptante_id")
    @Column(name = "adoptante", length = 50, nullable = false)
    private Adoptante adoptante;


}
