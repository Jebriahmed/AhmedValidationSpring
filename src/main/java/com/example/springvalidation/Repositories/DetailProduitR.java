package com.example.springvalidation.Repositories;

import com.example.springvalidation.Entities.DetailProduit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailProduitR extends JpaRepository<DetailProduit,Long> {
}
