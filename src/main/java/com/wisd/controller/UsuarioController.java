package com.wisd.controller;

/*
Importaciones necesarias
*/

import com.wisd.model.Usuario;
import com.wisd.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*
La anotación @RestController indica que esta clase
maneja las peticiones HTTP del sistema.
*/

@RestController

/*
Ruta base para los endpoints de usuarios
*/

@RequestMapping("/usuarios")

public class UsuarioController {

    /*
    Inyección del servicio de usuarios
    */

    @Autowired
    private UsuarioService usuarioService;

    /*
    Endpoint para registrar un nuevo usuario
    */

    @PostMapping("/registro")

    public Usuario registrar(@RequestBody Usuario usuario) {

        return usuarioService.registrarUsuario(usuario);

    }

    /*
    Endpoint para login de usuario
    */

    @PostMapping("/login")

    public String login(@RequestParam String correo,
                        @RequestParam String password) {

        return usuarioService.login(correo, password);

    }

}