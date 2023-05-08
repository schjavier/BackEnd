/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.security.service;

import com.backend.portfolio.security.entity.Rol;
import com.backend.portfolio.security.enums.RolNombre;
import com.backend.portfolio.security.repository.iRolRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author schja
 */
@Service
//hace que si hay errores no impactan en la base de datos
@Transactional
public class RolService {
    @Autowired 
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    } 
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
