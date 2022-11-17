package com.example.springvalidation.Services;

import com.example.springvalidation.Entities.Fournisseur;
import com.example.springvalidation.Entities.Produit;
import com.example.springvalidation.Repositories.FournisseurR;
import com.example.springvalidation.Repositories.ProduitR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IProduitIMP implements ProduitS{
    @Autowired
    private ProduitR produitR;
    @Autowired
    private FournisseurR fournisseurR;
    public List<Produit> retrieveAllProduits() {
        return produitR.findAll();
    }

    public Produit addProduit(Produit p, Long idRayon, Long idStock) {
        return produitR.save(p);
    }

    public Produit retrieveProduit(Long id) {
        return produitR.findById(id).orElse(null);
    }

    public void assignFournisseurToProduit(Long fournisseurId, Long produitId) {
        Fournisseur fournisseur = fournisseurR.findById(fournisseurId).orElse(null);
        Produit produit = produitR.findById(produitId).orElse(null);
        if (fournisseur != null && produit != null){
            produit.getFournisseurList().add(fournisseur);
        }
        produitR.save(produit);

    }
}
