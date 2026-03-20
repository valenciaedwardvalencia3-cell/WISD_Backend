package com.wisd.repository;

/*
Importaciones necesarias para trabajar con
Spring Data JPA
*/

import com.wisd.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*
@Repository indica que esta interfaz
se encarga de interactuar con la base de datos.
*/

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
