package com.example.proyectoFinalFSInte.service;

import com.example.proyectoFinalFSInte.model.Venta;
import com.example.proyectoFinalFSInte.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class VentaService {

    @Autowired
    private VentaRepository ventaRepository;

    public List<Venta> getAllVentas() {
        return ventaRepository.findAll();
    }

    public Optional<Venta> getVentaById(Long id) {
        return ventaRepository.findById(id);
    }

    public Venta saveVenta(Venta venta) {
        return ventaRepository.save(venta);
    }

    public List<Object[]> reporteVentas(Long clienteId, Long productoId, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
        return ventaRepository.reporteVentas(clienteId, productoId, fechaInicio, fechaFin);
    }
}