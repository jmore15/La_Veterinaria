package com.Veterinaria.dao;

import com.Veterinaria.domain.Registro;
import org.springframework.data.repository.CrudRepository;

public interface RegistroDao extends CrudRepository<Registro, Long> {

}
