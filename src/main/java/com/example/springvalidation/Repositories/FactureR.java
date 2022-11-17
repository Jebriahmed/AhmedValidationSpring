package com.example.springvalidation.Repositories;

import com.example.springvalidation.Entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureR extends JpaRepository<Facture,Long> {


}
