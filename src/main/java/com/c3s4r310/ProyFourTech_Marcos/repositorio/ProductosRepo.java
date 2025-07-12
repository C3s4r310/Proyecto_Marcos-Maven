package com.c3s4r310.ProyFourTech_Marcos.repositorio;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD
=======
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
>>>>>>> 3c9c43d (Consolidación: Recuperar versión con style.css + Spring Security + mejoras actuales)
import org.springframework.stereotype.Repository;

import com.c3s4r310.ProyFourTech_Marcos.modelo.Productos;

@Repository
public interface ProductosRepo extends JpaRepository<Productos, Long>{
<<<<<<< HEAD
    List<Productos> findByCategoria_Id(Long id);
=======
    // Consulta personalizada para buscar productos por categoría
    @Query("SELECT p FROM Productos p WHERE p.categoria.id = :idCategoria")
    List<Productos> findByCategoria_Id(@Param("idCategoria") Long idCategoria);
>>>>>>> 3c9c43d (Consolidación: Recuperar versión con style.css + Spring Security + mejoras actuales)
}
