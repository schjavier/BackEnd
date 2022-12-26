
package com.backend.portfolio.services;

import com.backend.portfolio.model.Educacion;
import java.util.List;


public interface IEducacionService {
    
    public List<Educacion> listarEducacion();
    public void crearEducacion(Educacion edu);
    public void eliminarEducacion(Long id);
    public Educacion buscarEducacion(Long id);
    
    
}
