
package com.portfolio.loginMR.ControllerEstudios;

import com.portfolio.loginMR.ModelEstudios.Estudios;
import com.portfolio.loginMR.RepositoryEstudios.IEstudiosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://frontend-58aeb.web.app" )
@RestController
public class EstudiosController {
    
    @Autowired
    IEstudiosService service;
   
    @GetMapping("/estudios")
    public List<Estudios> getEstudios(){
        return service.getEstudios();
    }

    
    @PostMapping ("/estudios/agregar")
    public Estudios agregar(@RequestBody Estudios estu){
        return service.add(estu);
    }
    
   @GetMapping("/estudios/{id}")
    public Estudios listarId(@PathVariable("id")int id){
        return service.listarId(id);
    }
    
    
   @PutMapping(path = {"/estudios/{id}"})
    public Estudios editar(@RequestBody Estudios estu,@PathVariable("id") int id){
        estu.setId(id);
        return service.edit(estu);
    }
   
        @DeleteMapping(path = {"/estudios/{id}"})
    public Estudios delete(@PathVariable("id") int  id){
        return service.delete(id);
    }
}