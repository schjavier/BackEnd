
package com.backend.portfolio.repository;

import com.backend.portfolio.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

//declaramos la interface, que extiende de Jparepository, entre <> indicamos el
//objeto a persistir, y el tipo de dato de la id

public interface PersonaRepository extends JpaRepository <Persona, Long>{
    
    
}
