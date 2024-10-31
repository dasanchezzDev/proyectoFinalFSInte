package com.example.proyectoFinalFSInte.controller;

import com.example.proyectoFinalFSInte.model.Cliente;
import com.example.proyectoFinalFSInte.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
@CrossOrigin(origins = "http://localhost:3000")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> getAllClientes() {
        return clienteService.getAllClientes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> getClienteById(@PathVariable Long id) {
        return clienteService.getClienteById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Cliente createCliente(@RequestBody Cliente cliente) {
        return clienteService.saveCliente(cliente);
    }

    @PutMapping("/{id}")
public ResponseEntity<Cliente> updateCliente(@PathVariable Long id, @RequestBody Cliente cliente) {
    return clienteService.getClienteById(id)
            .map(clienteExistente -> {
                clienteExistente.setNombre(cliente.getNombre());
                clienteExistente.setEmail(cliente.getEmail());
                clienteExistente.setTelefono(cliente.getTelefono());
                return ResponseEntity.ok(clienteService.saveCliente(clienteExistente));
            })
            .orElse(ResponseEntity.notFound().build());
}

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable Long id) {
        return clienteService.getClienteById(id)
                .map(cliente -> {
                    clienteService.deleteCliente(id);
                    return ResponseEntity.ok().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}