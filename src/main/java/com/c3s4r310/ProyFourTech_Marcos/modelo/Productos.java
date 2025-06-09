package com.c3s4r310.ProyFourTech_Marcos.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Productos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProducto;
    @Column(length = 3000)
    private String imagen;
    private String nombre;
    private BigDecimal precio;

    @ManyToOne
    private CategoriaProductos categoria;

}
