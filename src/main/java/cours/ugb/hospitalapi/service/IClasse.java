package cours.ugb.hospitalapi.service;


import cours.ugb.hospitalapi.model.Classe;

import java.util.List;

public interface IClasse {
    public Classe save(Classe classe);
    public Classe find(Long classe_d);
    public List<Classe> findAll();
    public void remove(Classe classe);
}
