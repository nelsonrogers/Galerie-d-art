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
public class Artiste extends Personne{
    
    @Column(unique=true)
    @NonNull
    private String biographie;
    
    @OneToMany(mappedBy="artiste")
    List<Tableau> tableaux = new LinkedList<>();
    
}
