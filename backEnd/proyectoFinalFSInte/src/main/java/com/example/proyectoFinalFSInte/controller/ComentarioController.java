package com.example.proyectoFinalFSInte.controller;

import com.example.proyectoFinalFSInte.model.Comentario;
import com.example.proyectoFinalFSInte.service.ComentarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/comentarios")
@CrossOrigin(origins = "http://localhost:3000")
public class ComentarioController {

    @Autowired
    private ComentarioService comentarioService;

    @GetMapping("/producto/{productoId}")
    public List<Comentario> getComentariosByProductoId(@PathVariable Long productoId) {
        return comentarioService.getComentariosByProductoId(productoId);
    }

    @PostMapping
    public Comentario createComentario(@RequestBody Comentario comentario) {
        return comentarioService.saveComentario(comentario);
    }
}