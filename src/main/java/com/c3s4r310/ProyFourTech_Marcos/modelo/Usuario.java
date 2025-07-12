package com.c3s4r310.ProyFourTech_Marcos.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor; // Añadir esta importación
import lombok.Data;         // Añadir esta importación
import lombok.NoArgsConstructor;  // Añadir esta importación

@Data // Genera getters, setters, toString, equals y hashCode con Lombok
@NoArgsConstructor // Genera un constructor sin argumentos
@AllArgsConstructor // Genera un constructor con todos los argumentos
@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_usuario; // Usamos Integer, lo cual es válido para MySQL INT

    @Column(nullable = false, length = 50) // Añadir validaciones de columna para nombres
    private String nombres;
    
    @Column(nullable = false, length = 50) // Añadir validaciones de columna para apellidos
    private String apellidos;

    @Column(unique = true, nullable = false, length = 100) // Asegurar que email no sea nulo y tenga longitud
    private String email;

    @Column(nullable = false, length = 255) // Asegurar que contra no sea nula
    private String contra;
    
    @Column(length = 9) // Longitud para teléfono
    private String telefono;
    
    @Column(length = 255) // Longitud para dirección
    private String direccion;
<<<<<<< HEAD
=======
    
    // Método para compatibilidad con Spring Security
    public String getPassword() {
        return this.contra;
    }
    
    public void setPassword(String password) {
        this.contra = password;
    }
    
    // Método getter para email (compatibilidad con JPA queries)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
>>>>>>> 3c9c43d (Consolidación: Recuperar versión con style.css + Spring Security + mejoras actuales)

}