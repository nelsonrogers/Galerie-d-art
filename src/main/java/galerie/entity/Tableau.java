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
public class Tableau {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    
    @Column(unique=true)
    @NonNull
    private String titre;
    
    @Column
    @NonNull
    private String support;
    
    @Column
    @NonNull
    private Integer largeur;
    
    @Column
    @NonNull
    private Integer hauteur;
    
    @ManyToMany(mappedBy = "oeuvres")
    List<Exposition> expositions = new LinkedList<>();
    
    @OneToOne
    Transaction transaction;
    
    // Artist can be None
    @ManyToOne
    Artiste artiste;
    
}
