package com.example.springvalidation.Controllers;

import com.example.springvalidation.Entities.Fournisseur;
import com.example.springvalidation.Services.FournisseurS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fournisseur")
public class FournisseurC {
    @Autowired
    private FournisseurS fournisseurS;

    @GetMapping("/allfournisseurs")
    public List<Fournisseur> retrieveAllClients() {
        return fournisseurS.retrieveAllFournisseur();
    }

    @PostMapping("/addfournisseur")
    public Fournisseur addFournisseur(@RequestBody Fournisseur c) {
        return fournisseurS.addFournisseur(c);
    }

    @DeleteMapping("/deletefournisseur/{id}")
    public void deleteFournisseur(@PathVariable Long id) {
        fournisseurS.deleteFournisseur(id);
    }

    @PutMapping("/updatefournisseur")
    public Fournisseur updateFournisseur(@RequestBody Fournisseur c) {
        return fournisseurS.updateFournisseur(c);
    }

    @GetMapping("/getonefournisseur/{id}")
    public Fournisseur retrieveFournisseur(@PathVariable Long id) {
        return fournisseurS.retrieveFournisseur(id);
    }
    public void assignFournisseurToProduit(Long fournisseurId, Long produitId){

    }
}
