package com.wisd.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

/*
Modelo que representa la tabla usuarios
en la base de datos
*/

@Entity
public class Usuario {

    /*
    ID del usuario (clave primaria)
    Se genera automáticamente en la base de datos
    */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*
    Nombre del usuario
    */

    private String nombre;

    /*
    Correo electrónico del usuario
    */

    private String correo;

    /*
    Contraseña del usuario
    */

    private String password;

    /*
    Constructor vacío requerido por Spring
    */

    public Usuario() {
    }

    /*
    Getters y Setters
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}