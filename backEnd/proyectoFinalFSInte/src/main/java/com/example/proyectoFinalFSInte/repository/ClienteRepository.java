package com.example.proyectoFinalFSInte.repository;

import com.example.proyectoFinalFSInte.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}