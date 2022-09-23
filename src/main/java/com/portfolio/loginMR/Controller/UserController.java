
package com.portfolio.loginMR.Controller;

import com.portfolio.loginMR.Model.Usuario;
import com.portfolio.loginMR.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class UserController {
    @Autowired
    private UserRepo repo;
    
    @PostMapping("/login")
    public ResponseEntity<?> login_User(@RequestBody Usuario userData){
      System.out.println(userData);
      Usuario usuario=repo.findByUserId(userData.getUserId());
      if(usuario.getPassword().equals(userData.getPassword()))
          return ResponseEntity.ok(usuario);
      return(ResponseEntity<?>)ResponseEntity.internalServerError();
    }
}
