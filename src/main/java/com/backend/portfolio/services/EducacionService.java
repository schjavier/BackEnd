package com.backend.portfolio.services;

import com.backend.portfolio.model.Educacion;
import com.backend.portfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{

    
    //inyectar las dependencias
    @Autowired
    EducacionRepository eduRepo;
    
    @Override
    public List<Educacion> listarEducacion() {
        return eduRepo.findAll();
    }

    @Override
    public void crearEducacion(Educacion edu) {
    eduRepo.save(edu);
    }

    @Override
    public void eliminarEducacion(Long id) {
    eduRepo.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(Long id) {
    return eduRepo.findById(id).orElse(null);}
    
}
