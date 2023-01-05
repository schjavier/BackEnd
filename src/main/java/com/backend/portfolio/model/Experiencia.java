package com.backend.portfolio.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table (name = "Experiencias")
public class Experiencia {
    
    @Id 
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;
    
    String empresa;
    String logo;
    String puesto;
    String anioComienzo;
    String anioFinal;
   
//    ver de declarar bien el tipo del atributo
    String descripcion;
    
    @JsonBackReference
    @ManyToOne
    private Persona persona;
    
    public Experiencia(){
    }
    
     public Experiencia (Long id, String empresa, String logo, String puesto, String anioComienzo, String anioFinal, String descripcion){
        
        this.id = id;
        this.empresa = empresa;
        this.logo = logo;
        this.puesto = puesto;
        this.anioComienzo = anioComienzo;
        this.anioFinal = anioFinal;
        this.descripcion = descripcion;
        
    }
}
