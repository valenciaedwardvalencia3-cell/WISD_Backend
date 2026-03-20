package com.wisd.service;

/*
Importaciones necesarias
*/
import com.wisd.model.Usuario;
import com.wisd.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
La anotación @Service indica que esta clase
contiene la lógica de negocio de la aplicación.
*/
@Service
public class UsuarioService {

    /*
    Inyección del repositorio de usuarios.
    Permite acceder a la base de datos.
    */
    @Autowired
    private UsuarioRepository usuarioRepository;

    /*
    Método para registrar un nuevo usuario
    en la base de datos.
    Se valida primero que el correo no esté duplicado.
    */
    public Usuario registrarUsuario(Usuario usuario) {

        // 🔎 Validar si el correo ya existe en la base de datos
        if (usuarioRepository.existsByCorreo(usuario.getCorreo())) {
            // 🚨 Lanzar excepción controlada para evitar duplicados
            // Esta excepción será atrapada por GlobalExceptionHandler
            throw new RuntimeException("El correo ya está registrado");
        }

        // ✅ Guardar el nuevo usuario en la base de datos
        return usuarioRepository.save(usuario);
    }

    /*
    Método para validar el login del usuario
    comparando correo y contraseña.
    */
    public String login(String correo, String password) {

        // 🔎 Buscar el usuario por su correo
        Usuario usuario = usuarioRepository.findByCorreo(correo);

        // 🚨 Validar si el usuario existe
        if (usuario == null) {
            return "Usuario no encontrado";
        }

        // 🚨 Validar si la contraseña coincide
        if (!usuario.getPassword().equals(password)) {
            return "Contraseña incorrecta";
        }

        // ✅ Si todo es correcto, login exitoso
        return "Login exitoso";
    }
}
