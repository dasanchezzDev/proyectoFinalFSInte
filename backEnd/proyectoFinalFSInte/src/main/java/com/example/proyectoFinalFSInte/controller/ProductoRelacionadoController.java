package com.example.proyectoFinalFSInte.controller;

import com.example.proyectoFinalFSInte.model.ProductoRelacionado;
import com.example.proyectoFinalFSInte.service.ProductoRelacionadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/productos-relacionados")
@CrossOrigin(origins = "http://localhost:3000")
public class ProductoRelacionadoController {

    @Autowired
    private ProductoRelacionadoService productoRelacionadoService;

    @GetMapping("/{productoId}")
    public ResponseEntity<ProductoRelacionado> getProductosRelacionados(@PathVariable Long productoId) {
        return productoRelacionadoService.getProductosRelacionados(productoId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ProductoRelacionado createProductoRelacionado(@RequestBody ProductoRelacionado productoRelacionado) {
        return productoRelacionadoService.saveProductoRelacionado(productoRelacionado);
    }
}
