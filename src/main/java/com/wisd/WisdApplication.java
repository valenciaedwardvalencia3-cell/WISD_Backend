package com.wisd;

/*
Importaciones necesarias para ejecutar Spring Boot
*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
Clase principal del proyecto WISD

La anotación @SpringBootApplication indica que esta clase
es el punto de inicio de la aplicación Spring Boot.
*/

@SpringBootApplication
public class WisdApplication {

    /*
    Método principal que inicia la aplicación
    Spring Boot y levanta el servidor Tomcat.
    */

    public static void main(String[] args) {

        SpringApplication.run(WisdApplication.class, args);

    }

}