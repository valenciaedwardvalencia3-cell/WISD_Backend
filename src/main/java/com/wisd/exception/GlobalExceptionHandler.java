package com.wisd.exception;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

/*
 * GlobalExceptionHandler
 * ----------------------
 * Centraliza el manejo de excepciones en la aplicación.
 * Devuelve respuestas JSON claras y estructuradas.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /*
     * Manejo de errores de integridad de datos (ejemplo: correo duplicado).
     */
    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<Map<String, String>> handleDataIntegrityViolation(DataIntegrityViolationException ex) {
        Map<String, String> response = new HashMap<>();

        if (ex.getRootCause() != null && ex.getRootCause().getMessage().contains("Duplicate entry")) {
            response.put("error", "El correo ya está registrado");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
        }

        response.put("error", "Error de integridad en la base de datos");
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }

    /*
     * Manejo genérico de RuntimeException.
     */
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Map<String, String>> handleRuntimeException(RuntimeException ex) {
        Map<String, String> response = new HashMap<>();
        response.put("error", ex.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }
}
