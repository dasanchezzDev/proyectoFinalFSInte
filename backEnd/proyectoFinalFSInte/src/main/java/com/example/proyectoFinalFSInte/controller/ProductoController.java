package com.example.proyectoFinalFSInte.controller;

import com.example.proyectoFinalFSInte.model.Producto;
import com.example.proyectoFinalFSInte.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
@CrossOrigin(origins = "http://localhost:3000")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> getAllProductos() {
        return productoService.getAllProductos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> getProductoById(@PathVariable Long id) {
        return productoService.getProductoById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Producto createProducto(@RequestBody Producto producto) {
        return productoService.saveProducto(producto);
    }

    @PutMapping("/{id}")
public ResponseEntity<Producto> updateProducto(@PathVariable Long id, @RequestBody Producto producto) {
    return productoService.getProductoById(id)
            .map(productoExistente -> {
                productoExistente.setNombre(producto.getNombre());
                productoExistente.setPrecio(producto.getPrecio());
                productoExistente.setInventario(producto.getInventario());
                return ResponseEntity.ok(productoService.saveProducto(productoExistente));
            })
            .orElse(ResponseEntity.notFound().build());
}

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProducto(@PathVariable Long id) {
        return productoService.getProductoById(id)
                .map(producto -> {
                    productoService.deleteProducto(id);
                    return ResponseEntity.ok().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}