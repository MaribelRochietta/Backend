
package com.portfolio.loginMR.RepositorySobre;

import com.portfolio.loginMR.ModelSobre.Sobre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SobreRepository extends JpaRepository<Sobre, Integer>{


}
