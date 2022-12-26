package com.backend.portfolio.services;

import com.backend.portfolio.model.Proyecto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backend.portfolio.repository.ProyectoRepository;


@Service
public class ProyectoService implements IProyectoService {

    @Autowired
    ProyectoRepository proyeRepo; 
    
    @Override
    public List<Proyecto> listarProyectos() {
        return proyeRepo.findAll();
   }

    @Override
    public void agregarProyecto(Proyecto pro) {
        proyeRepo.save(pro);
    }

    @Override
    public void eliminarProyecto(Long id) {
    proyeRepo.deleteById(id);}
    
    @Override
    public Proyecto buscarProyecto(Long id) {
    return proyeRepo.findById(id).orElse(null);}
    
}
