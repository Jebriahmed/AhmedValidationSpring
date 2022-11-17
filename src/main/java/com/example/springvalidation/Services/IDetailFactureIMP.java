package com.example.springvalidation.Services;

import com.example.springvalidation.Entities.DetailFacture;
import com.example.springvalidation.Repositories.DetailFactureR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IDetailFactureIMP implements DetailFactureS{
    @Autowired
    private DetailFactureR detailFactureR;
    @Override
    public DetailFacture update(DetailFacture df) {
        return detailFactureR.save(df);
    }

    @Override
    public void delete(Long id) {
        detailFactureR.deleteById(id);
    }

    @Override
    public DetailFacture add(DetailFacture df) {
        return detailFactureR.save(df);
    }

    @Override
    public List<DetailFacture> getall() {
        return detailFactureR.findAll();
    }

    @Override
    public DetailFacture getone(Long id) {
        return detailFactureR.findById(id).orElse(null);
    }

}
