package com.example.proyectoFinalFSInte.repository;

import com.example.proyectoFinalFSInte.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}