package com.backend.portfolio.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table (name = "Personas")
public class Persona {
 
    @Id  
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;
    
    String nombre;
    String apellido;
    String acercaDe;
    String puesto;
    String fotoPerfil;
    String fotoBanner;
    
    @OneToMany (mappedBy = "persona")
    List<Experiencia> experiencia;
    
    @OneToMany (mappedBy = "persona")
    List<Educacion> educacion;
    
    @OneToMany (mappedBy = "persona")
    List<Proyecto> proyecto;
    
   
    
    public Persona(){
    }
    
    public Persona (Long id, String nombre, String apellido, String acercaDe, String puesto, String fotoPerfil, String fotoBanner){
        
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.acercaDe = acercaDe ; 
        this.puesto = puesto;
        this.fotoPerfil = fotoPerfil;
        this.fotoBanner = fotoBanner;
        
    }
}
