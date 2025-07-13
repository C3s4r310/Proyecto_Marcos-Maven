package com.c3s4r310.ProyFourTech_Marcos.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.c3s4r310.ProyFourTech_Marcos.modelo.Productos;
import com.c3s4r310.ProyFourTech_Marcos.repositorio.ProductosRepository;

@Service
public class ProductosServices {

    @Autowired
    private ProductosRepository repo_productos;

    public List<Productos> listarPorCategoria(Integer categoriaId) {
        return repo_productos.findByCategoria_IdCategoria(categoriaId);
    }

}
