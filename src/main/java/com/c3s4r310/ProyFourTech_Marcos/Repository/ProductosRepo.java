package com.c3s4r310.ProyFourTech_Marcos.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.c3s4r310.ProyFourTech_Marcos.Models.Productos;

@Repository
public interface ProductosRepo extends JpaRepository<Productos, Long>{
    List<Productos> findByCategoria_Id(Long id);

}
