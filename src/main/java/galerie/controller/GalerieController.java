/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galerie.controller;

import galerie.dao.GalerieRepository;
import galerie.entity.Galerie;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 *
 * @author nelsonrogers
 */
@Controller
@RequestMapping(path="/galeries/show")
public class GalerieController {
    
    // besoin du dao ==> @autowired : galerie repository
    @Autowired
    private GalerieRepository galerieDAO;
    
    public String afficherGaleries(Model model){
        List<Galerie> listeG = galerieDAO.findAll(); // revoie liste de galeries
        model.addAttribute("listegaleries", listeG);
        return "Listegaleries"; //page html
        
    }
    
    
}
