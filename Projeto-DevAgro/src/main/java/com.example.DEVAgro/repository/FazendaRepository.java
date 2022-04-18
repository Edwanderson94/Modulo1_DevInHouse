package com.example.DEVAgro.repository;


import com.example.DEVAgro.model.Fazenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FazendaRepository extends JpaRepository <Fazenda, Long> {

}
