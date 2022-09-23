
package com.portfolio.loginMR.RepositoryProyectos;

import com.portfolio.loginMR.ModelProyectos.Proyectos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepository extends JpaRepository <Proyectos, Integer>{
    
    void delete(Proyectos proy);
    Proyectos save(Proyectos proy);
    
}