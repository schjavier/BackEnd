package com.backend.portfolio.services;

import com.backend.portfolio.model.Experiencia;
import com.backend.portfolio.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {

    @Autowired
    ExperienciaRepository expoRepo;
    
    @Override
    public List<Experiencia> listarExperiencia() {
        return expoRepo.findAll();
    }

    @Override
    public void crearExperiencia(Experiencia exp) {
        expoRepo.save(exp);
    }

    @Override
    public void eliminarExperiencia(Long id) {
        expoRepo.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(Long id) {
        return expoRepo.findById(id).orElse(null);
    }
    
}
