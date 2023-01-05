
package com.backend.portfolio.controller;

import com.backend.portfolio.model.Persona;
import com.backend.portfolio.services.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("persona")
@CrossOrigin (origins = "http://localhost:4200")
public class persController {
    
    @Autowired
    private IPersonaService personaServ;
    
    
    @PostMapping ("/new")
    public void agregarPersona(@RequestBody Persona per){
        personaServ.crearPersona(per);
        
    }
    
//    metodo que trae solo una persona
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Persona mostrarPersona(@PathVariable Long id){
        return personaServ.mostrarPersona(id);
    } 
    
    @DeleteMapping ("/borrar/{id}")
    public void borrarPersona(@PathVariable Long id){
        personaServ.eliminarPersona(id);
    }
    
    @PutMapping ("/editar/{id}")
    public Persona editarPersona (@PathVariable Long id, @RequestBody Persona per){
        
        Persona perso = personaServ.buscarPersona(id);
        
        perso.setNombre(per.getNombre());
        perso.setApellido(per.getApellido());
        perso.setPuesto(per.getPuesto());
        perso.setAcercaDe(per.getAcercaDe());
        perso.setFotoPerfil(per.getFotoPerfil());
        perso.setFotoBanner(per.getFotoBanner());
        
        personaServ.crearPersona(perso);
        return perso;
    }
    
    
}
