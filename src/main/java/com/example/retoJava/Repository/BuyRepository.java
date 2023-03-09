package com.example.retoJava.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.retoJava.Model.Buy; 

@Repository
public interface BuyRepository extends JpaRepository<Buy, Long>{
    
}
