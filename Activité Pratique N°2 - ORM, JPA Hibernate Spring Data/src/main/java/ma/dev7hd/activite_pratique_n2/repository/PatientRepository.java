package ma.dev7hd.activite_pratique_n2.repository;

import ma.dev7hd.activite_pratique_n2.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

//Q5: Création l'interface JPA Repository basée sur Spring data
public interface PatientRepository extends JpaRepository<Patient, Long> {
    List<Patient> findByNomContains(String nom);
    Patient getPatientsById(Long l);

}
