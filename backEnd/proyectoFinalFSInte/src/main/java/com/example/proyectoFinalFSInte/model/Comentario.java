package com.example.proyectoFinalFSInte.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import java.time.LocalDateTime;

@Document(collection = "comentarios")
public class Comentario {
    @Id
    private String id;
    private Long productoId;
    private String usuario;
    private String comentario;
    private LocalDateTime fecha;

    public Comentario() {}

    public Comentario(Long productoId, String usuario, String comentario, LocalDateTime fecha) {
        this.productoId = productoId;
        this.usuario = usuario;
        this.comentario = comentario;
        this.fecha = fecha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getProductoId() {
        return productoId;
    }

    public void setProductoId(Long productoId) {
        this.productoId = productoId;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}