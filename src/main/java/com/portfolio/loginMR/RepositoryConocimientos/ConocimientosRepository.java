
package com.portfolio.loginMR.RepositoryConocimientos;

import com.portfolio.loginMR.ModelConocimientos.Conocimientos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ConocimientosRepository extends JpaRepository <Conocimientos, Integer>{
  
    void delete(Conocimientos con);
    Conocimientos save(Conocimientos con);
    
}