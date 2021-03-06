/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.dao;

import lombok.extern.log4j.Log4j2;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

/**
 *
 * @author nelsonrogers
 */

@Log4j2 // Génère le 'logger' pour afficher les messages de trace
@DataJpaTest
public class ExpositionRepositoryTest {
    
    @Autowired
    private ExpositionRepository expositionDAO;
    
    @Test
    //@Sql("data.sql") // On peut charger des donnnées spécifiques pour un test
    public void onSaitCompterLesEnregistrements() {
        log.info("On compte les enregistrements de la table 'Exposition'");
        int combienDansLeJeuDeTest = 3; 
        long nombre = expositionDAO.count();
        assertEquals(combienDansLeJeuDeTest, nombre, "On doit trouver 3 exposition");
    }
    
    
    @Test
    public void testChiffreAffaires(){
        // Rogers a acheté la joconde à 2 000 000€ et Bastide a acheté Ciel Bleu à 1000€
        // voir les valeurs dans le fichier data.sql
        assertEquals(2_000_000 + 1000, expositionDAO.chiffreAffaires(4));
    }
}
