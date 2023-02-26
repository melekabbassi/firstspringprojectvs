package com.example.firstspringprojectvs;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IMedicamentRepository extends JpaRepository<Medicament, Integer> {
    
}
