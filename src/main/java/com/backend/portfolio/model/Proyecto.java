package com.backend.portfolio.model;

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
@Table (name = "Proyectos")
public class Proyecto {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    Long id;
    
    String nombre;
    String imagen;
    String descripcion;
    String comienzo;
    String fin;
    
    @ManyToOne
    private Persona persona;

    public Proyecto() {
    }

    public Proyecto(Long id, String nombre, String imagen, String descripcion, String comienzo, String fin, Persona persona) {
        this.id = id;
        this.nombre = nombre;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.comienzo = comienzo;
        this.fin = fin;
        this.persona = persona;
    }
    
    
    
}
