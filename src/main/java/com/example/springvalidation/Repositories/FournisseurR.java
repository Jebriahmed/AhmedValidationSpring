package com.example.springvalidation.Repositories;

import com.example.springvalidation.Entities.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FournisseurR extends JpaRepository<Fournisseur,Long> {
}
