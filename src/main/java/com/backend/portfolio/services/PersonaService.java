package com.backend.portfolio.services;

import com.backend.portfolio.model.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.backend.portfolio.repository.PersonaRepository;

@Service
public class PersonaService implements IPersonaService{

//    inyectamos las dependecias
    @Autowired
    PersonaRepository personaRepo;
    
    
//    implementamos los metodos del CRUD
    @Override
    public List<Persona> verPersonas() {
        return personaRepo.findAll();
    }
        

    @Override
    public void crearPersona(Persona per) {
        personaRepo.save(per);
    }

    @Override
    public void eliminarPersona(Long id) {
        personaRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        return personaRepo.findById(id).orElse(null);
        }
    
    
    
}
