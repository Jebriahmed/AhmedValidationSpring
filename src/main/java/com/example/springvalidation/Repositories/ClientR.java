package com.example.springvalidation.Repositories;

import com.example.springvalidation.Entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientR extends JpaRepository<Client,Long> {
}
