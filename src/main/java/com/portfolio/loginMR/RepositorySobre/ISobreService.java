
package com.portfolio.loginMR.RepositorySobre;

import com.portfolio.loginMR.ModelSobre.Sobre;
import java.util.List;


public interface ISobreService {
    public List<Sobre>getSobre();
    public void saveSobre (Sobre sob);
    public Sobre listarId(int id);
    Sobre edit(Sobre sob);
}
