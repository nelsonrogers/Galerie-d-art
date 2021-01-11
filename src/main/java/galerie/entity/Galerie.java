package galerie.entity;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import lombok.*;

// Un exemple d'entité
//
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity // Une entité JPA
public class Galerie {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;

    @Column(unique=true)
    @NonNull
    private String nom;
    
    @Column(unique=true)
    @NonNull
    private String adresse;
    
    // TODO : Mettre en oeuvre la relation oneToMany vers Exposition
    @OneToMany(mappedBy = "galerie")
    private List<Exposition> expositions = new LinkedList<>();
    
    
    //should i use queries here ??
    public float caAnnuel(int annee){
        float ca = 0;
        for (Exposition expo : expositions){
            int debut = expo.getDebut().getYear();
            if (debut == annee)
                ca += expo.chiffreAffaires();
        }
        return ca;
    }
}

