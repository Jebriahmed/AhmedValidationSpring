package com.example.springvalidation.Services;

import com.example.springvalidation.Entities.Facture;

import java.util.List;

public interface FactureS {
    public Facture update(Facture f);
    public void delete(Long id);
    public Facture add(Facture f);
    public List<Facture> getall();
    //public Optional <CategorieProduit> getone(Long id);
    public Facture getone(Long id);
    public List<Facture> getFacturesByClient(Long idClient);
}
