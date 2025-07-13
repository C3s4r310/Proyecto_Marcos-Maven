package com.c3s4r310.ProyFourTech_Marcos.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.c3s4r310.ProyFourTech_Marcos.modelo.Productos;

@Repository
public interface ProductosRepository extends JpaRepository<Productos, Integer>{
    // Consulta personalizada para buscar productos por categoría
    @Query("SELECT p FROM Productos p WHERE p.categoria.idCategoria = :idCategoria")
    List<Productos> findByCategoria_IdCategoria(@Param("idCategoria") Integer idCategoria);
}
