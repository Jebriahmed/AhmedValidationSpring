package com.example.springvalidation.Repositories;

import com.example.springvalidation.Entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockR extends JpaRepository<Stock,Long> {
}
