package com.example.proyectoFinalFSInte.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import java.util.List;

@Document(collection = "productos_relacionados")
public class ProductoRelacionado {
    @Id
    private String id;
    private Long productoId;
    private List<Long> productosRelacionados;

    public ProductoRelacionado() {}

    public ProductoRelacionado(Long productoId, List<Long> productosRelacionados) {
        this.productoId = productoId;
        this.productosRelacionados = productosRelacionados;
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

    public List<Long> getProductosRelacionados() {
        return productosRelacionados;
    }

    public void setProductosRelacionados(List<Long> productosRelacionados) {
        this.productosRelacionados = productosRelacionados;
    }
}