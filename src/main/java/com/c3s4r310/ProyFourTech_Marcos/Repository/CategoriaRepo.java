package com.c3s4r310.ProyFourTech_Marcos.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.c3s4r310.ProyFourTech_Marcos.Models.CategoriaProductos;

@Repository
public interface CategoriaRepo extends JpaRepository<CategoriaProductos, Long>{
    //List<Productos> findByProductos() 
}
