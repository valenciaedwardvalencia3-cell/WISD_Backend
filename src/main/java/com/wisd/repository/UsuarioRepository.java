package com.wisd.repository;

/*
Importaciones necesarias para trabajar
con Spring Data JPA
*/
import com.wisd.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
La anotación @Repository indica que esta interfaz
se encarga de acceder a la base de datos.
Spring Data JPA se encarga de generar automáticamente
las consultas SQL basadas en los nombres de los métodos.
*/
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    /*
    Método personalizado para buscar un usuario
    por su correo electrónico.
    Ejemplo: SELECT * FROM usuarios WHERE correo = ?
    */
    Usuario findByCorreo(String correo);

    /*
    Método para verificar si ya existe un usuario
    con un correo específico.
    Útil para evitar registros duplicados.
    Ejemplo: SELECT COUNT(*) FROM usuarios WHERE correo = ?
    */
    boolean existsByCorreo(String correo);
}
