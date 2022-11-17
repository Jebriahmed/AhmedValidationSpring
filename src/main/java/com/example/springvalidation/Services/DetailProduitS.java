package com.example.springvalidation.Services;

import com.example.springvalidation.Entities.DetailFacture;

import java.util.List;

public interface DetailProduitS {
    public DetailFacture update(DetailFacture df);
    public void delete(Long id);
    public DetailFacture add(DetailFacture df);
    public List<DetailFacture> getall();
    //public Optional <CategorieProduit> getone(Long id);
    public DetailFacture getone(Long id);
}
