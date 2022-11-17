package com.example.springvalidation.Services;

import com.example.springvalidation.Entities.Client;
import com.example.springvalidation.Repositories.ClientR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IClientIMP implements ClientS{
    @Autowired
    private ClientR clientR;
    @Override
    public Client update(Client c) {
        return clientR.save(c);
    }

    @Override
    public void delete(Long id) {
        clientR.deleteById(id);

    }

    @Override
    public Client add(Client c) {
        return clientR.save(c);
    }

    @Override
    public List<Client> getall() {
        return clientR.findAll();
    }

    @Override
    public Client getone(Long id) {
        return clientR.findById(id).orElse(null);
    }
}
