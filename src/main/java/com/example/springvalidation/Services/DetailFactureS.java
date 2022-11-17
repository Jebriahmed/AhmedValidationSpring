package com.example.springvalidation.Services;

import com.example.springvalidation.Entities.DetailFacture;

import java.util.List;

public interface DetailFactureS {
    DetailFacture update(DetailFacture df);

    void delete(Long id);

    DetailFacture add(DetailFacture df);

    List<DetailFacture> getall();

    DetailFacture getone(Long id);
}
