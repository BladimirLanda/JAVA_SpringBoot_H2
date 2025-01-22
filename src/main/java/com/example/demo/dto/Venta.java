package com.example.demo.dto;

import jakarta.persistence.*;

@Entity
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_venta;

    @Column(name = "prodcuto")
    private String producto;

    @Column(name = "precio")
    private int precio;

    //Métodos
    public long getId_venta() {
        return id_venta;
    }

    public void setId_venta(long id_venta) {
        this.id_venta = id_venta;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    //Referencia Clase
    @Override
    public String toString() {
        return "Venta{" +
                "id_venta=" + id_venta +
                ", producto='" + producto + '\'' +
                ", precio=" + precio +
                '}';
    }
}
