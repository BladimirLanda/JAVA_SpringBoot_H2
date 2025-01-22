package com.example.demo.Controller;

import com.example.demo.dto.Venta;
import com.example.demo.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class VentaController {

    @Autowired
    VentaService ventaService;

    //POST
    @PostMapping("/ventas")
    public ResponseEntity<Venta> postVenta(@RequestBody Venta venta){
        Venta ventaCreada = ventaService.postVenta(venta);

        return ResponseEntity.status(HttpStatus.CREATED).body(ventaCreada);
    }

    //GET BY ID
    @GetMapping("/ventas/{id}")
    public ResponseEntity<Venta> getById(@PathVariable Long id) {
        Optional<Venta> ventaRecibida = ventaService.getById(id);

        if( ventaRecibida.isPresent() ) {
            return ResponseEntity.ok( ventaRecibida.get() );
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    //GET ALl
    @GetMapping("/ventas")
    public List<Venta> getAll() {
        return ventaService.getAll();
    }

    //PUT
    @PutMapping("/ventas/{id}")
    public ResponseEntity<Venta> updateVenta(@PathVariable Long id, @RequestBody Venta ventaActualizada) {
        Optional<Venta> ventaRecibida = ventaService.getById(id);

        if( ventaRecibida.isPresent() ) {
            ventaActualizada.setId_venta(id);
            ventaService.updateVenta(ventaActualizada);

            return ResponseEntity.ok(ventaActualizada);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    //DELETE
    @DeleteMapping("/ventas/{id}")
    public ResponseEntity<Void> deleteVenta(@PathVariable Long id) {
        ventaService.deleteVenta(id);

        return ResponseEntity.noContent().build();
    }

}
