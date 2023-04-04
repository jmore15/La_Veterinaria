package com.Veterinaria.dao;

import com.Veterinaria.domain.Medico;
import org.springframework.data.repository.CrudRepository;

public interface MedicoDao extends CrudRepository<Medico, Long> {

}
