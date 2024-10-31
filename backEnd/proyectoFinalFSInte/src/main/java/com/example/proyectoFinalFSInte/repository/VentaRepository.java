package com.example.proyectoFinalFSInte.repository;

import com.example.proyectoFinalFSInte.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface VentaRepository extends JpaRepository<Venta, Long> {
    @Query(value = "CALL reporte_ventas(:clienteId, :productoId, :fechaInicio, :fechaFin)", nativeQuery = true)
    List<Object[]> reporteVentas(@Param("clienteId") Long clienteId,
                                 @Param("productoId") Long productoId,
                                 @Param("fechaInicio") LocalDateTime fechaInicio,
                                 @Param("fechaFin") LocalDateTime fechaFin);
}