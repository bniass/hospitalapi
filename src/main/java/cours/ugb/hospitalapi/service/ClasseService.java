package cours.ugb.hospitalapi.service;


import cours.ugb.hospitalapi.dao.ClasseRepository;
import cours.ugb.hospitalapi.model.Classe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClasseService implements IClasse {
    @Autowired
    private ClasseRepository classeRepository;

    @Override
    public Classe save(Classe classe) {
        return classeRepository.save(classe);
    }

    @Override
    public Classe find(Long classe_id) {
        Optional<Classe> classe = classeRepository.findById(classe_id);
        if(classe.isPresent())
            return  classe.get();
        return null;
    }

    @Override
    public List<Classe> findAll() {
        return classeRepository.findAll();
    }

    @Override
    public void remove(Classe classe) {
        classeRepository.delete(classe);

    }
}
