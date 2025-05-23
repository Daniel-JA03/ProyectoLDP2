package com.cibertec.app.repository;

import com.cibertec.app.entity.Personal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface PersonalRepository extends JpaRepository<Personal, Long> {
    
}
