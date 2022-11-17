package com.example.springvalidation.Services;

import com.example.springvalidation.Entities.Fournisseur;
import com.example.springvalidation.Entities.Fournisseur;

import java.util.List;

public interface FournisseurS {
    public List<Fournisseur> retrieveAllFournisseur();
    public Fournisseur addFournisseur(Fournisseur c);
    public void deleteFournisseur(Long id);
    public Fournisseur updateFournisseur(Fournisseur c);
    public Fournisseur retrieveFournisseur(Long id);


}
