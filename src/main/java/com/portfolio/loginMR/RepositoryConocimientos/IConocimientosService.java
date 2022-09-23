
package com.portfolio.loginMR.RepositoryConocimientos;

import com.portfolio.loginMR.ModelConocimientos.Conocimientos;
import java.util.List;

public interface IConocimientosService {
    
    public List<Conocimientos>getConocimientos();
    public void saveConocimientos (Conocimientos con);
    public Conocimientos listarId(int id);
    Conocimientos edit(Conocimientos con);
    Conocimientos delete(int id);
    public Conocimientos add(Conocimientos con);
}
