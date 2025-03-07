package com.example.demo.service;

import com.example.demo.dto.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta, Long> { }
