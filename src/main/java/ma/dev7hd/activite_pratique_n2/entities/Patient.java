package ma.dev7hd.activite_pratique_n2.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@Table(name = "PATIENTS")
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString
public class Patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    //Q3: Création de l'entité JPA Patient
    private Long id;
    private String nom;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;
    private int score;
    private boolean malade;
}
