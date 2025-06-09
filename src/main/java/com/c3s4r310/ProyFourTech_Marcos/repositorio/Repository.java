package com.c3s4r310.ProyFourTech_Marcos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.c3s4r310.ProyFourTech_Marcos.modelo.Usuario;

public interface Repository extends JpaRepository<Usuario, Integer> {
    // Puedes agregar consultas personalizadas si es necesario
}
