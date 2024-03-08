package ma.dev7hd.activite_pratique_n2;

import ma.dev7hd.activite_pratique_n2.entities.Patient;
import ma.dev7hd.activite_pratique_n2.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class ActivitePratiqueN2Application {

    public static void main(String[] args) {
        SpringApplication.run(ActivitePratiqueN2Application.class, args);
    }

    @Bean
    CommandLineRunner start(PatientRepository patientRepository) {
        return args -> {
            //Q6-1: L'ajout des patients
            patientRepository.save(new Patient(null,"Bob",new Date(1987-1900,2,14),142,false));
            patientRepository.save(new Patient(null,"Alex",new Date(1998-1900,5,20),102,true));
            patientRepository.save(new Patient(null,"Jasmin",new Date(2003-1900,10,17),98,true));
            patientRepository.save(new Patient(null,"Sarah",new Date(2000-1900,4,30),135,false));

            //Q6-2: Consultation de tous les patients
            List<Patient> patients = patientRepository.findAll();
            System.out.println("\n**********************List des patients************************");
            patients.forEach(System.out::println);
            System.out.println("***************************************************************\n");

            //Q6-3: Consultation d'un patient
            System.out.println("Le premier patient: ");
            Patient firstPatient = patients.getFirst();
            System.out.println(firstPatient);

            //Q6-4: Recherche d'un patient qui contient la lettre 'B' dans son nom
            List<Patient> patient = patientRepository.findByNomContains("B");
            System.out.println("\nList des patients qui ont la lettre 'B' dans leurs noms: ");
            patient.forEach(System.out::println);
            System.out.println("***************************************************************\n");

            //Q6-5: Mis à jour d'un patient
            Patient p = patientRepository.getPatientsById(1L);
            p.setScore(162);
            p.setNom("William");
            p.setMalade(true);
            patientRepository.save(p);
            System.out.println("Nouvelle version des informations du patient: " + patientRepository.getPatientsById(1L));
            System.out.println("***************************************************************\n");

            //Q6-6: Suppression d'un patient
            patientRepository.deleteById(2L);
            System.out.println("\n**********************List des patients************************");
            patients = patientRepository.findAll();
            patients.forEach(System.out::println);
            System.out.println("***************************************************************\n");
        };

    }
}
