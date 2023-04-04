package com.Veterinaria.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "paciente")
public class Paciente {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMascota;
    private String nombre;
    private String especie;
    private String raza;
    private String fechaNac;
    private String color;
    private Long idCliente;

    public Paciente() {
    }

    public Paciente(String nombre, String especie, String raza, String fechaNac, String color, Long idCliente) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.fechaNac = fechaNac;
        this.color = color;
        this.idCliente = idCliente;
    }
    
    

}
