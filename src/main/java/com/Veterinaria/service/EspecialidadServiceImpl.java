package com.Veterinaria.service;

import com.Veterinaria.dao.EspecialidadDao;
import com.Veterinaria.domain.Especialidad;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EspecialidadServiceImpl implements EspecialidadService {

    @Autowired
    EspecialidadDao especialidadDao;

    @Override
    @Transactional(readOnly = true)
    public List<Especialidad> getEspecialidades() {
        return (List<Especialidad>) especialidadDao.findAll();
    }

    @Override
    @Transactional
    public void delete(Especialidad especialidad) {
        especialidadDao.deleteById(especialidad.getIdespecialidad());
    }

    @Override
    @Transactional
    public void save(Especialidad especialidad) {
        especialidadDao.save(especialidad);
    }

    @Override
    public List<Especialidad> getEspecialidadPorNombre(String nombreEspec) {
        return especialidadDao.findByNombre(nombreEspec);
    }

    @Override
    @Transactional(readOnly = true)
    public Especialidad getEspecialidad(Especialidad especialidad) {
        return especialidadDao.findById(especialidad.getIdespecialidad()).orElse(null);
    }

}
