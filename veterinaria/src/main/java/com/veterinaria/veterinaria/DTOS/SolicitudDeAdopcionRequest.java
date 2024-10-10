package com.veterinaria.veterinaria.DTOS;

import com.veterinaria.veterinaria.Entity.Adoptante;
import com.veterinaria.veterinaria.Entity.Mascota;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter

public class SolicitudDeAdopcionRequest {

private int id;
private Date fecha;
private String estado;
private Mascota mascota;
private Adoptante adoptante;
}
