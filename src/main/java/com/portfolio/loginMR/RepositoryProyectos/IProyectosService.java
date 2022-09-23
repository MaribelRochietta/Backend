
package com.portfolio.loginMR.RepositoryProyectos;

import com.portfolio.loginMR.ModelProyectos.Proyectos;
import java.util.List;


public interface IProyectosService {
  
    public List<Proyectos>getProyectos();
    public void saveProyectos (Proyectos proy);
    public Proyectos listarId(int id);
    Proyectos edit(Proyectos proy);
    Proyectos delete(int id);
    public Proyectos add(Proyectos proy);

}
