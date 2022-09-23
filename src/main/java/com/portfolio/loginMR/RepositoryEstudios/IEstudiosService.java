
package com.portfolio.loginMR.RepositoryEstudios;

import com.portfolio.loginMR.ModelEstudios.Estudios;
import java.util.List;

public interface IEstudiosService {
    
    
    public List<Estudios>getEstudios();
    public void saveEstudios (Estudios estu);
    public Estudios listarId(int id);
    Estudios edit(Estudios estu);
    Estudios delete(int id);
    public Estudios add(Estudios estu);


}
