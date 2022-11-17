package com.example.springvalidation.Services;

import com.example.springvalidation.Entities.Client;

import java.util.List;

public interface ClientS {
    public Client update(Client c);
    public void delete(Long id);
    public Client add(Client c);
    public List<Client> getall();
    //public Optional <CategorieProduit> getone(Long id);
    public Client getone(Long id);
}
