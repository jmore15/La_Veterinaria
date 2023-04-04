package com.Veterinaria.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "cita")
public class Cita implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCita;
    private long idMascota;
    private long idMedico;
    private String nombre;
    private String fecha;
    private String hora;

    public Cita() {
    }

    public Cita(long idMascota, long idMedico, String nombre, String fecha, String hora) {
        this.idMascota = idMascota;
        this.idMedico = idMedico;
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
    }

    
}
