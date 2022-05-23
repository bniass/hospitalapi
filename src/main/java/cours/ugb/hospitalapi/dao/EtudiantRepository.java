package cours.ugb.hospitalapi.dao;


import cours.ugb.hospitalapi.model.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    public Etudiant findByMatricule(String matricule);
   // @Query("SELECT MAX (e.id) FROM Etudiant e")
    //public long getMaxId();
}
