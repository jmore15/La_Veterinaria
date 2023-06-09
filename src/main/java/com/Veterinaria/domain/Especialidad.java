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
@Table(name = "especialidad")
public class Especialidad implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idespecialidad;
    private String nombreEspec;

    public Especialidad() {
    }

    public Especialidad(String nombreEspec) {
        this.nombreEspec = nombreEspec;
    }
   

}
