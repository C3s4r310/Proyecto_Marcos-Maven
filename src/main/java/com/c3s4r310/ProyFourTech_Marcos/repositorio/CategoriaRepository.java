package com.c3s4r310.ProyFourTech_Marcos.repositorio;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.c3s4r310.ProyFourTech_Marcos.modelo.CategoriaProductos;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaProductos, Long>{
    //List<Productos> findByProductos() 
}
