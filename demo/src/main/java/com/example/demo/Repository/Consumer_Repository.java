package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Consumer;

@Repository
public interface Consumer_Repository  extends JpaRepository<Consumer,Integer>{

    
}
