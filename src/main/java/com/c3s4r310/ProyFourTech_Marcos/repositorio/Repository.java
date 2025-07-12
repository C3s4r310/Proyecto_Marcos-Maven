package com.c3s4r310.ProyFourTech_Marcos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.c3s4r310.ProyFourTech_Marcos.modelo.Usuario;

public interface Repository extends JpaRepository<Usuario, Integer> {
    // Consulta personalizada para Spring Security usando @Query
    @Query("SELECT u FROM Usuario u WHERE u.email = :email")
    Usuario findByEmail(@Param("email") String email);
}
