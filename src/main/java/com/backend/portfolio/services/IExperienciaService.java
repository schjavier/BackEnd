package com.backend.portfolio.services;

import com.backend.portfolio.model.Experiencia;
import java.util.List;

public interface IExperienciaService {
    
    public List<Experiencia> listarExperiencia();
    public void crearExperiencia(Experiencia exp);
    public void eliminarExperiencia(Long id);
    public Experiencia buscarExperiencia(Long id);
    
    
    
}
