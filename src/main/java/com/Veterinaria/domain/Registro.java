package com.Veterinaria.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "registro")
public class Registro {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRegistro;
    private Long idMascota;
    private String padecimiento;
    private String tratamiento;
    private String diagnostico;
    private Long idCita;

    public Registro() {
    }

    public Registro(Long idMascota, String padecimiento, String tratamiento, String diagnostico, Long idCita) {
        this.idMascota = idMascota;
        this.padecimiento = padecimiento;
        this.tratamiento = tratamiento;
        this.diagnostico = diagnostico;
        this.idCita = idCita;
    }
    
    
}
