package com.example.springvalidation.Services;

import com.example.springvalidation.Entities.Produit;
import com.example.springvalidation.Repositories.FournisseurR;
import com.example.springvalidation.Repositories.ProduitR;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface ProduitS {

    List<Produit> retrieveAllProduits();

    Produit addProduit(Produit p, Long idRayon, Long idStock);

    Produit retrieveProduit(Long id);
    public void assignFournisseurToProduit(Long fournisseurId, Long produitId) ;
}
