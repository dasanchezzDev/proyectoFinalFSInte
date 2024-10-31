package com.example.proyectoFinalFSInte.repository;

import com.example.proyectoFinalFSInte.model.Comentario;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ComentarioRepository extends MongoRepository<Comentario, String> {
    List<Comentario> findByProductoId(Long productoId);
}