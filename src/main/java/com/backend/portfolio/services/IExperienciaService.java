package com.backend.portfolio.services;

import com.backend.portfolio.model.Experiencia;
import java.util.List;

public interface IExperienciaService {
    
    public List<Experiencia> listarExperiencia();
//    metodo que trae una sola experiencia.
    public Experiencia mostrarExperiencia (Long id);
    public void crearExperiencia(Experiencia exp);
    public void eliminarExperiencia(Long id);
    public Experiencia buscarExperiencia(Long id);
//    metodo para guardar una experiencia utilizado en la edicion de las experiencias
    public Experiencia guardarExperiencia(Experiencia exp);
    
    
    
}
