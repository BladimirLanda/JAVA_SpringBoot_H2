package com.example.demo.service;

import com.example.demo.dto.Venta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VentaService {

    @Autowired
    VentaRepository ventaRepository;

    //POST
    public Venta postVenta(Venta venta) {
        return ventaRepository.save(venta);
    }

    //GET BY ID
    public Optional<Venta> getById(Long id) {
        return ventaRepository.findById(id);
    }

    //GET ALL
    public List<Venta> getAll() {
        return ventaRepository.findAll();
    }

    //PUT
    public void updateVenta(Venta venta) {
        ventaRepository.save(venta);
    }

    //DELETE
    public void deleteVenta(Long id) {
        ventaRepository.deleteById(id);
    }

}
