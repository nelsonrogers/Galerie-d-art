/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;

import java.time.LocalDate;
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
public class Exposition {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    @Column
    @NonNull
    private LocalDate debut;
    
    @Column(unique=true)
    @NonNull
    private String intitule;
    
    @Column
    @NonNull
    private Integer duree;
    
    @ManyToOne
    private Galerie galerie;
    
    @OneToMany(mappedBy="lieuDeVente")
    List<Transaction> transactions = new LinkedList<>();
    
    @ManyToMany
    List<Tableau> oeuvres = new LinkedList<>();
    
    public float chiffreAffaires() {
        float ca = 0;
        for (Transaction transaction : transactions){
            ca += transaction.getPrixVente();
        }
        return ca;
    }
    
}
