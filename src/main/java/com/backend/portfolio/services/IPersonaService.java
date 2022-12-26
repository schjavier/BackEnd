
package com.backend.portfolio.services;

import com.backend.portfolio.model.Persona;
import java.util.List;

//aca definimos los metodos del CRUD pero no los implementamos

public interface IPersonaService {
    
    public List<Persona> verPersonas();
    public void crearPersona(Persona Per);
    public void eliminarPersona(Long id);
    public Persona buscarPersona(Long id);
    
}
