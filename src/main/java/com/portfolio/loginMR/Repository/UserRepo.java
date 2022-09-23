
package com.portfolio.loginMR.Repository;

import com.portfolio.loginMR.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends JpaRepository<Usuario, String> {
    Usuario findByUserId(String userId);
}
