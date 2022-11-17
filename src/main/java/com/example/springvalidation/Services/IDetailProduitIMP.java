package com.example.springvalidation.Services;

import com.example.springvalidation.Entities.DetailFacture;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IDetailProduitIMP implements DetailProduitS{
    @Override
    public DetailFacture update(DetailFacture df) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public DetailFacture add(DetailFacture df) {
        return null;
    }

    @Override
    public List<DetailFacture> getall() {
        return null;
    }

    @Override
    public DetailFacture getone(Long id) {
        return null;
    }
}
