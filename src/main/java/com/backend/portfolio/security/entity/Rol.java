/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.security.entity;

import com.backend.portfolio.security.enums.RolNombre;
import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author schja
 */
@Entity
public class Rol {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @NotNull
//    notation que define los valores que vamos a ingresar, es este caso de tipo string
    @Enumerated (EnumType.STRING)
    private RolNombre rolNombre;

//constuctor

    public Rol() {
    }

    public Rol(RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }
//setters and getter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RolNombre getRolNombre() {
        return rolNombre;
    }

    public void setRolNombre(RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }
    
}

