package com.example.proyectoFinalFSInte.service;

import com.example.proyectoFinalFSInte.model.ProductoRelacionado;
import com.example.proyectoFinalFSInte.repository.ProductoRelacionadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductoRelacionadoService {

    @Autowired
    private ProductoRelacionadoRepository productoRelacionadoRepository;

    public Optional<ProductoRelacionado> getProductosRelacionados(Long productoId) {
        return productoRelacionadoRepository.findByProductoId(productoId);
    }

    public ProductoRelacionado saveProductoRelacionado(ProductoRelacionado productoRelacionado) {
        return productoRelacionadoRepository.save(productoRelacionado);
    }
}