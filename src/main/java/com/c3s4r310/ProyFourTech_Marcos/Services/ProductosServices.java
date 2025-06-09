package com.c3s4r310.ProyFourTech_Marcos.Services;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c3s4r310.ProyFourTech_Marcos.modelo.Productos;
import com.c3s4r310.ProyFourTech_Marcos.repositorio.ProductosRepo;

@Service
public class ProductosServices {

    @Autowired
    private ProductosRepo repo_productos;

    public List<Productos> listarPorCategoria(Long categoriaId) {
        return repo_productos.findByCategoria_Id(categoriaId);
    }

}
