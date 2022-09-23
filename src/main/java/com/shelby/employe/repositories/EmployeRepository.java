package com.shelby.employe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shelby.employe.models.Employe;

@Repository
public interface EmployeRepository  extends JpaRepository<Employe, Long>{
    
}
