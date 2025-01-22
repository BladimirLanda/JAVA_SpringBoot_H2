package com.example.demo.service;

import com.example.demo.dto.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface VentaRepository extends JpaRepository<Venta, Long> {
}
