package com.backend.portfolio.services;

import com.backend.portfolio.model.Proyecto;
import java.util.List;

public interface IProyectoService {
    
    public List<Proyecto> listarProyectos();
    public void agregarProyecto(Proyecto pro);
    public void eliminarProyecto(Long id);
    public Proyecto buscarProyecto(Long id);
    
}
