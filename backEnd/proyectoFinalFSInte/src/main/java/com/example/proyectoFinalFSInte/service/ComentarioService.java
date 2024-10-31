package com.example.proyectoFinalFSInte.service;

import com.example.proyectoFinalFSInte.model.Comentario;
import com.example.proyectoFinalFSInte.repository.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComentarioService {

    @Autowired
    private ComentarioRepository comentarioRepository;

    public List<Comentario> getComentariosByProductoId(Long productoId) {
        return comentarioRepository.findByProductoId(productoId);
    }

    public Comentario saveComentario(Comentario comentario) {
        return comentarioRepository.save(comentario);
    }
}