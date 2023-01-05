package com.backend.portfolio.controller;


import com.backend.portfolio.model.Educacion;
import com.backend.portfolio.services.IEducacionService;
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
@RequestMapping ("educacion")
@CrossOrigin (origins = "http://localhost:4200")
public class eduController {
    
    @Autowired
    private IEducacionService eduServ;
    
    @PostMapping ("/new")
    public void agregarEducacion(@RequestBody Educacion edu){
    eduServ.crearEducacion(edu);
    }
    
    @GetMapping ("/ver")
    @ResponseBody
    public List<Educacion> verEducacion(){
    return eduServ.listarEducacion();
    }
    
    @DeleteMapping ("/borrar/{id}")
    public void borrarEducacion(@PathVariable Long Id){
    eduServ.eliminarEducacion(Id);}
    
    @PutMapping ("/editar/{id}")
    public Educacion editarEducacion (@PathVariable Long id, @RequestBody Educacion edu){
        Educacion educacion = eduServ.buscarEducacion(id);
        
        educacion.setInstitucion(edu.getInstitucion());
        educacion.setLogo(edu.getLogo());
        educacion.setTitulo(edu.getTitulo());
        educacion.setAnioComienzo(edu.getAnioComienzo());
        educacion.setAnioFinal(edu.getAnioFinal());
        
        return educacion;
        
        
        
    
    }
            
}
