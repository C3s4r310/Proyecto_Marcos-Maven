package com.c3s4r310.ProyFourTech_Marcos.controlador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.c3s4r310.ProyFourTech_Marcos.modelo.Usuario;
import com.c3s4r310.ProyFourTech_Marcos.repositorio.Repository;


@org.springframework.stereotype.Controller

public class Controller {

    @Autowired
    private Repository usuarioRepository;

    @GetMapping("/")
    public String mostrarPaginaPrincipal() {
        return "index.html"; // Nombre de la plantilla
    }

    @GetMapping("/laptops")
    public String mostrarLaptops() {
        return "laptops.html"; // Nombre de la plantilla
    }

    @GetMapping("/pcs")
    public String mostrarPcs() {
        return "computadoras.html"; // Nombre de la plantilla
    }

    @GetMapping("/accesorios")
    public String mostrarAccesorios() {
        return "accesorios.html"; // Nombre de la plantilla
    }

    @GetMapping("/registro")
    public String mostrarRegistro(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "registro";
    }

    @PostMapping("/registrarUsuario")
    public String registrarUsuario(@ModelAttribute Usuario usuario, RedirectAttributes redirectAttributes) {
        
        usuarioRepository.save(usuario);

        // Enviar mensaje de éxito al redirigir
        redirectAttributes.addFlashAttribute("mensajeExito", "¡Usuario registrado correctamente!");

        return "redirect:/registro"; // redirecciona después del registro
    }

    
}
