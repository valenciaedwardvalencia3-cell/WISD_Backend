package com.wisd.model;

/*
Importaciones necesarias para trabajar con
Spring Boot y JPA (persistencia en base de datos)
*/

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*
La anotación @Entity indica que esta clase
representa una tabla en la base de datos.
*/

@Entity
public class Producto {

    /*
    @Id indica la clave primaria de la tabla
    */

    @Id

    /*
    @GeneratedValue permite que el id se genere
    automáticamente en la base de datos.
    */

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*
    Nombre del producto
    */

    private String nombre;

    /*
    Precio del producto
    */

    private double precio;

    /*
    Descripción del producto
    */

    private String descripcion;

    /*
    Imagen del producto (ruta o nombre del archivo)
    */

    private String imagen;

    /*
    Constructor vacío obligatorio para JPA
    */

    public Producto() {
    }

    /*
    GETTERS Y SETTERS
    Permiten acceder y modificar los datos
    */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}