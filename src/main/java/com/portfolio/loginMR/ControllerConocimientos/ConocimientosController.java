
package com.portfolio.loginMR.ControllerConocimientos;


import com.portfolio.loginMR.ModelConocimientos.Conocimientos;
import com.portfolio.loginMR.RepositoryConocimientos.IConocimientosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
public class ConocimientosController {
      
    @Autowired
    IConocimientosService service;
   
    @GetMapping("/conocimientos")
    public List<Conocimientos> getConocimientos(){
        return service.getConocimientos();
    }
    
    @PostMapping ("/conocimientos/agregar")
    public Conocimientos agregar(@RequestBody Conocimientos con){
        return service.add(con);
    }
    
   @GetMapping("/conocimientos/{id}")
    public Conocimientos listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    
    
   @PutMapping(path = {"/conocimientos/{id}"})
    public Conocimientos editar(@RequestBody Conocimientos con,@PathVariable("id") int id){
        con.setId(id);
        return service.edit(con);
    }
   
        @DeleteMapping(path = {"/conocimientos/{id}"})
    public Conocimientos delete(@PathVariable("id") int  id){
        return service.delete(id);
    }
}