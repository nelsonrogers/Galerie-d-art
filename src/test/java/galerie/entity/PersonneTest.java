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
public class PersonneTest {

    LocalDate acheteLe = LocalDate.of(2020, 05, 22);
    LocalDate acheteLe2 = LocalDate.of(2020, 05, 22);
    LocalDate acheteLe3 = LocalDate.of(2021, 01, 03);
    
    int duree = 20;
    
    float prixVente = 20_000;
    float prixVente2 = 60_000;
    float prixVente3 = 100_000;
    
    List<Transaction> transactions = new LinkedList<>();
    
    Transaction transaction = new Transaction(acheteLe, prixVente);
    Transaction transaction2 = new Transaction(acheteLe2, prixVente2);
    Transaction transaction3 = new Transaction(acheteLe3, prixVente3);
    
    Personne bastide = new Personne("Bastide", "Place Jean Jaures");
    
    /*
    Bastide a acheté 3 tableaux : - 2 en 2020 à 20 000€ et 60 000€
                                  - 1 en 2021 à 100 000€
    */
    
    
    @BeforeEach
    public void setup(){
        bastide.setTransactions(transactions);
        
        transactions.add(transaction);
        transactions.add(transaction2);
        transactions.add(transaction3);
    }
    
    
    @Test
    public void testBudgetArt(){
        float ca = bastide.budgetArt(2020);
        assertEquals(20_000 + 60_000, ca, "le chiffre d'affaires doit être de 80 000");
    }
    
}
