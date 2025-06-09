package com.c3s4r310.ProyFourTech_Marcos.Controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.c3s4r310.ProyFourTech_Marcos.Services.ProductosServices;
import com.c3s4r310.ProyFourTech_Marcos.modelo.Productos;

import org.springframework.web.bind.annotation.GetMapping;



@Controller
//@RequestMapping("/productos")
public class ProductosController {

    /*@Autowired
    private ProductosServices services_pro;
    @GetMapping("/")
    public String index() {
        return "index"; // Carga index.html
    }

    @GetMapping("/computadoras")
    public String listarPcs(Model model) {
        Long idCategoria = 1L;
        List<Productos> productos = services_pro.listarPorCategoria(idCategoria);
        model.addAttribute("productos", productos);
        return "computadoras";
    }

    @GetMapping("/laptops")
    public String listarLaptops(Model model) {
        Long idCategoria = 2L;
        List<Productos> productos = services_pro.listarPorCategoria(idCategoria);
        model.addAttribute("productos", productos);
        return "laptops";
    }

    @GetMapping("/accesorios")
    public String listarAccesorios() {
        return "accesorios";
    }*/

}
