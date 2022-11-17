package com.example.springvalidation.Services;

import com.example.springvalidation.Entities.Client;
import com.example.springvalidation.Entities.Facture;
import com.example.springvalidation.Repositories.ClientR;
import com.example.springvalidation.Repositories.FactureR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IFactureIMP implements FactureS{
    @Autowired
    private FactureR factureR;
    @Autowired
    private ClientR clientR;

    @Override
    public Facture update(Facture f) {
        return factureR.save(f);
    }

    @Override
    public void delete(Long id) {
        factureR.deleteById(id);
    }

    @Override
    public Facture add(Facture f) {
        return factureR.save(f);
    }

    @Override
    public List<Facture> getall() {
        return factureR.findAll();
    }

    @Override
    public Facture getone(Long id) {
        return factureR.findById(id).orElse(null);
    }

    @Override
    public List<Facture> getFacturesByClient(Long idClient) {
        Client c=clientR.findById(idClient).orElse(null);
        return (List<Facture>) c;
    }
}
