
package com.portfolio.loginMR.ServiceEstudios;

import com.portfolio.loginMR.ModelEstudios.Estudios;
import com.portfolio.loginMR.RepositoryEstudios.EstudiosRepository;
import com.portfolio.loginMR.RepositoryEstudios.IEstudiosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EstudiosService implements IEstudiosService{
    @Autowired
    private EstudiosRepository repositorio;
    

    @Override
    public List<Estudios> getEstudios(){
        List<Estudios> listarEstudios = repositorio.findAll();
        return listarEstudios;
    }
    
    @Override
    public Estudios add(Estudios estu) {
        return repositorio.save(estu);
    }

    @Override
    public Estudios edit(Estudios estu) {
        return repositorio.save(estu);
    }
      
     @Override
    public Estudios delete(int id) {
        Estudios estu = repositorio.findById(id).orElse(null);
        if(estu!=null){
            repositorio.delete(estu);
        }
       return estu;
    }

     @Override
    public Estudios listarId(int id) {
        Estudios estu = repositorio.findById(id).orElse(null);
        return estu;
    }

    @Override
    public void saveEstudios(Estudios estu) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}