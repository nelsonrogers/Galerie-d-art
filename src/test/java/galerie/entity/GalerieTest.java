/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.entity;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author nelsonrogers
 */
public class GalerieTest {
    
    LocalDate debut = LocalDate.of(2020, 12, 20);
    LocalDate venduLe = LocalDate.of(2020, 12, 22);
    
    LocalDate debut2 = LocalDate.of(2021, 01, 01);
    LocalDate venduLe2 = LocalDate.of(2021, 01, 03);
    
    String intitule = "CastresExpo", intitule2 = "CastresExpo2", 
            nom = "GalerieCastres", adresse = "Place Jean Jaures";
    
    int duree = 20;
    
    float prixVente = 20_000;
    float prixVente2 = 100_000;
    
    List<Transaction> transactions = new LinkedList<>();
    List<Transaction> transactions2 = new LinkedList<>();
    
    List<Exposition> expositions = new LinkedList<>();
    
    Exposition expo = new Exposition(debut, intitule, duree);
    Exposition expo2 = new Exposition(debut2, intitule2, duree);
    
    Transaction transaction = new Transaction(venduLe, prixVente);
    Transaction transaction_bis = new Transaction(venduLe, prixVente);
    Transaction transaction2 = new Transaction(venduLe2, prixVente2);
    
    Galerie galerie = new Galerie(nom, adresse);
    
    /*
    On a créé deux expositions : expo et expo2. 
    Ces expositons ont lieu dans la même Galerie : galerie
    expo a lieu en 2020 et expo2 en 2021. 
    Dans expo on a vendu 2 tableaux à 20 000€, dans expo2 on a vendu un tableau à 100 000€.
    */
    

    @BeforeEach
    public void setup(){
        galerie.setExpositions(expositions);
        expositions.add(expo);
        expositions.add(expo2);
        
        expo.setTransactions(transactions);
        transactions.add(transaction);
        transactions.add(transaction_bis);
        
        expo2.setTransactions(transactions2);
        transactions2.add(transaction2);
        
        galerie.setExpositions(expositions);
    }
    
    @Test
    public void testCaAnnuel(){
        float ca = galerie.caAnnuel(2020);
        assertEquals(2 * 20000, ca, "le chiffre d'affaires doit être de 40 000");
    }
}
