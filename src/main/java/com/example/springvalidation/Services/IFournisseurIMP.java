package com.example.springvalidation.Services;

import com.example.springvalidation.Entities.Fournisseur;
import com.example.springvalidation.Entities.Produit;
import com.example.springvalidation.Repositories.FournisseurR;
import com.example.springvalidation.Repositories.ProduitR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IFournisseurIMP implements FournisseurS{
    @Autowired
    private FournisseurR fournisseurR;

    @Autowired
    private ProduitR produitR;
    @Override
    public List<Fournisseur> retrieveAllFournisseur() {
        return fournisseurR.findAll();
    }

    @Override
    public Fournisseur addFournisseur(Fournisseur c) {
        return fournisseurR.save(c);
    }

    @Override
    public void deleteFournisseur(Long id) {
        fournisseurR.deleteById(id);
    }

    @Override
    public Fournisseur updateFournisseur(Fournisseur c) {
        return fournisseurR.save(c);
    }

    @Override
    public Fournisseur retrieveFournisseur(Long id) {
        return fournisseurR.findById(id).orElse(null);
    }




}
