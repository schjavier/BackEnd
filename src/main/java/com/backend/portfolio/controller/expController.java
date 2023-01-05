package com.backend.portfolio.controller;

import com.backend.portfolio.model.Experiencia;
import com.backend.portfolio.services.IExperienciaService;
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
@RequestMapping ("experiencia")
@CrossOrigin (origins = "http://localhost:4200")
public class expController {
    
    @Autowired
    private IExperienciaService expServ;
    
    @PostMapping ("/new")
    public void agregarExperiencia(@RequestBody Experiencia exp){
        expServ.crearExperiencia(exp);
    }
    
    @GetMapping ("/ver")
    @ResponseBody
    public List<Experiencia> verExperiencias (){
        return expServ.listarExperiencia();
    }
    
    @PutMapping ("/editar/{id}")
    public Experiencia editarExperiencia (@PathVariable Long id, @RequestBody Experiencia exp){
        
        Experiencia experiencia = expServ.buscarExperiencia(id);
        
        experiencia.setEmpresa(exp.getEmpresa());
        experiencia.setLogo(exp.getLogo());
        experiencia.setPuesto(exp.getPuesto());
        experiencia.setAnioComienzo(exp.getAnioComienzo());
        experiencia.setAnioFinal(exp.getAnioFinal());
        
        return experiencia; 
    }
    
    @DeleteMapping ("/borrar/{id}")
    public void borrarExperiencia(@PathVariable Long id){
    expServ.eliminarExperiencia(id);
    }
}