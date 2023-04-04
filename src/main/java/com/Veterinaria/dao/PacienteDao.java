package com.Veterinaria.dao;

import com.Veterinaria.domain.Paciente;
import org.springframework.data.repository.CrudRepository;

public interface PacienteDao extends CrudRepository<Paciente, Long> {

}
