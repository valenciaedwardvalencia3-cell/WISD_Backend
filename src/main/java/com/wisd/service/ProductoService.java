package com.wisd.service;

/*
Importaciones necesarias
*/

import com.wisd.model.Producto;
import com.wisd.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
@Service indica que esta clase contiene
la lógica del sistema.
*/

@Service
public class ProductoService {

    /*
    Inyección del repositorio
    */

    @Autowired
    private ProductoRepository productoRepository;

    /*
    Método para guardar un producto
    */

    public Producto guardarProducto(Producto producto) {

        return productoRepository.save(producto);

    }

    /*
    Método para obtener todos los productos
    */

    public List<Producto> listarProductos() {

        return productoRepository.findAll();

    }

}