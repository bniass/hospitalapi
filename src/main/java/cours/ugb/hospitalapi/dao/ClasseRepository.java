package cours.ugb.hospitalapi.dao;


import cours.ugb.hospitalapi.model.Classe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasseRepository extends JpaRepository<Classe,Long> {

}
