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
@Table(name = "medico")
public class Medico implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long idMedico;
     private long idEspecialidad;
    private String nombre;
    private String apellido;

    public Medico() {
    }

    public Medico(long idEspecialidad, String nombre, String apellido) {
        this.idEspecialidad = idEspecialidad;
        this.nombre = nombre;
        this.apellido = apellido;
    }


}
