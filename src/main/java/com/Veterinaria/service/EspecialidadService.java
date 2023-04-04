package com.Veterinaria.service;

import com.Veterinaria.domain.Especialidad;
import java.util.List;

public interface EspecialidadService {
    public List<Especialidad> getEspecialidades();
    
    public Especialidad getEspecialidad(Especialidad especialidad);
    
    public void save(Especialidad especialidad);
    
    public void delete(Especialidad especialidad);
    
    public List<Especialidad> getEspecialidadPorNombre(String nombreEspec);

}
