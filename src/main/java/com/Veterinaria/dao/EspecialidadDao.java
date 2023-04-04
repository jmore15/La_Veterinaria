package com.Veterinaria.dao;

import com.Veterinaria.domain.Especialidad;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface EspecialidadDao extends CrudRepository<Especialidad, Long> {

public List<Especialidad> findByNombre(String nombreEspec);
}
