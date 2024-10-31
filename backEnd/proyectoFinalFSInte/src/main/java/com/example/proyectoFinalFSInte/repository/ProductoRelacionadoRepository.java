package com.example.proyectoFinalFSInte.repository;

import com.example.proyectoFinalFSInte.model.ProductoRelacionado;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ProductoRelacionadoRepository extends MongoRepository<ProductoRelacionado, String> {
    Optional<ProductoRelacionado> findByProductoId(Long productoId);
}