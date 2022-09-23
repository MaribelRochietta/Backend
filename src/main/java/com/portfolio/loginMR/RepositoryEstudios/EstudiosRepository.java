
package com.portfolio.loginMR.RepositoryEstudios;

import com.portfolio.loginMR.ModelEstudios.Estudios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudiosRepository extends JpaRepository <Estudios, Integer>{
    void delete(Estudios estu);
    Estudios save(Estudios estu);

}
