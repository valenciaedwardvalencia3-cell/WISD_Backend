package com.wisd.controller;

/*
Importaciones necesarias
*/

import com.wisd.model.Producto;
import com.wisd.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*
@RestController indica que esta clase
maneja peticiones HTTP
*/

@RestController

/*
Ruta base de la API de productos
*/

@RequestMapping("/productos")

public class ProductoController {

    /*
    Inyección del servicio
    */

    @Autowired
    private ProductoService productoService;

    /*
    Endpoint para registrar un producto
    */

    @PostMapping("/crear")

    public Producto crearProducto(@RequestBody Producto producto) {

        return productoService.guardarProducto(producto);

    }

    /*
    Endpoint para listar productos
    */

    @GetMapping("/lista")

    public List<Producto> listarProductos() {

        return productoService.listarProductos();

    }

}
