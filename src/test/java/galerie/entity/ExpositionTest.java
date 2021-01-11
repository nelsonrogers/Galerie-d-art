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
public class ExpositionTest {
    
    LocalDate debut = LocalDate.of(2020, 10, 20);
    LocalDate venduLe = LocalDate.of(2020, 10, 22);
    
    String intitule = "CastresExpo";
    
    int duree = 20;
    
    float prixVente = 20_000, prixVente2 = 100_000;
    
    List<Transaction> transactions = new LinkedList<>();
    
    Exposition expo = new Exposition(debut, intitule, duree);
    
    Transaction transaction = new Transaction(venduLe, prixVente);
    Transaction transaction2 = new Transaction(venduLe, prixVente2);

    @BeforeEach
    public void setup(){
        expo.setTransactions(transactions);
        transactions.add(transaction);
        transactions.add(transaction2);
    }
    
    
    @Test
    public void testChiffreAffaires(){
        float ca = expo.chiffreAffaires();
        assertEquals(20000 + 100000, ca, "le chiffre d'affaires doit être de 120 000");
    }
}
