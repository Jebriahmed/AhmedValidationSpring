package com.example.springvalidation.Repositories;

import com.example.springvalidation.Entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitR extends JpaRepository<Produit,Long> {
}
