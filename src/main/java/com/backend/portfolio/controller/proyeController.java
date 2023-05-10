package com.backend.portfolio.controller;

import com.backend.portfolio.model.Proyecto;
import com.backend.portfolio.services.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
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
@RequestMapping ("proyecto")
@CrossOrigin (origins = "https://portfolio-backend-o7mu.onrender.com")
public class proyeController {
    
    @Autowired 
    private IProyectoService proyeServ;
    

    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping ("/new")
    public void agregarProyecto(@RequestBody Proyecto pro){
        proyeServ.agregarProyecto(pro);
    }
    
    @GetMapping ("/ver")
    @ResponseBody
    public List<Proyecto> verProyecto (){
        return proyeServ.listarProyectos();
    }
    
    @GetMapping ("/ver/{id}")
    @ResponseBody
    public Proyecto mostrarProyecto(@PathVariable Long id){
        return proyeServ.mostrarProyecto(id);
    }
    
//    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping ("/editar/{id}")
    public Proyecto editarProyecto (@PathVariable Long id, @RequestBody Proyecto pro){
        
        Proyecto proyecto = proyeServ.buscarProyecto(id);
        
        proyecto.setNombre(pro.getNombre());
        proyecto.setImagen(pro.getImagen());
        proyecto.setDescripcion(pro.getDescripcion());
        proyecto.setComienzo(pro.getComienzo());
        proyecto.setFin(pro.getFin());
        
        return proyeServ.guardarProyecto(pro); 
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping ("/borrar/{id}")
    public void borrarProyecto(@PathVariable Long id){
    proyeServ.eliminarProyecto(id);
    }
    
}
