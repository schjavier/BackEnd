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
@Table (name = "Educacion")

public class Educacion {
    
    @Id
    @GeneratedValue (strategy=GenerationType.AUTO)
    private Long id;
    
    private String institucion;
    private String logo;
    private String titulo;
    private String anioComienzo;
    private String anioFinal;

    @ManyToOne
    private Persona persona;
    
    public Educacion() {
    }

    public Educacion(Long id, String institucion, String logo, String titulo, String anioComienzo, String anioFinal) {
        this.id = id;
        this.institucion = institucion;
        this.logo = logo;
        this.titulo = titulo;
        this.anioComienzo = anioComienzo;
        this.anioFinal = anioFinal;
    }
    
    
}
