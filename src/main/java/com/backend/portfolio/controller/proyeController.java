package com.backend.portfolio.controller;

import com.backend.portfolio.model.Proyecto;
import com.backend.portfolio.services.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class proyeController {
    
    @Autowired 
    private IProyectoService proyeServ;
    
    @PostMapping ("/new/proyecto")
    public void agregarProyecto(@RequestBody Proyecto pro){
        proyeServ.agregarProyecto(pro);
    }
    
    @GetMapping ("/ver/proyectos")
    @ResponseBody
    public List<Proyecto> verProyecto (){
        return proyeServ.listarProyectos();
    }
    
    @PutMapping ("proyecto/editar/{id}")
    public Proyecto editarProyecto (@PathVariable Long id, @RequestBody Proyecto pro){
        
        Proyecto proyecto = proyeServ.buscarProyecto(id);
        
        proyecto.setNombre(pro.getNombre());
        proyecto.setImagen(pro.getImagen());
        proyecto.setDescripcion(pro.getDescripcion());
        proyecto.setComienzo(pro.getComienzo());
        proyecto.setFin(pro.getFin());
        
        return proyecto; 
    }
    
    @DeleteMapping ("proyacto/borrar/{id}")
    public void borrarProyecto(@PathVariable Long id){
    proyeServ.eliminarProyecto(id);
    }
    
}
