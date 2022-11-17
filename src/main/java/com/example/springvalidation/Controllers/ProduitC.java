package com.example.springvalidation.Controllers;

import com.example.springvalidation.Entities.Produit;
import com.example.springvalidation.Services.ProduitS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/produit")
public class ProduitC {
    @Autowired
    private ProduitS produitS;
    @GetMapping("/allproduits")
    List<Produit> retrieveAllProduits() {
        return produitS.retrieveAllProduits();
    }
    @PostMapping("/addproduit")
    Produit addProduit(Produit p, Long idRayon, Long idStock) {
        return produitS.addProduit(p,idRayon,idStock);
    }
    @GetMapping("/getoneproduit")
    Produit retrieveProduit(Long id) {
        return produitS.retrieveProduit(id);
    }
    public void assignFournisseurToProduit(Long fournisseurId, Long produitId) {
        produitS.assignFournisseurToProduit(fournisseurId,produitId);
    }
}
