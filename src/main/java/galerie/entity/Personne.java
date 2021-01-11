/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;

import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import lombok.*;

/**
 *
 * @author nelsonrogers
 */
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Personne {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    @Column
    @NonNull
    private String nom;
    
    @Column(unique=true)
    @NonNull
    private String adresse;
    
    @OneToMany(mappedBy="acheteur")
    List<Transaction> transactions = new LinkedList<>();
    
    
    public float budgetArt(int annee) {
        float budgetAnnuel = 0;
        for (Transaction transaction : transactions){
            if (transaction.getVenduLe().getYear() == annee)
                budgetAnnuel += transaction.getPrixVente();
        }
        return budgetAnnuel;
    }
}
