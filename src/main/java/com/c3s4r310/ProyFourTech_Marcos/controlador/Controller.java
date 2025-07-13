package com.c3s4r310.ProyFourTech_Marcos.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.c3s4r310.ProyFourTech_Marcos.Services.ProductosServices;
import com.c3s4r310.ProyFourTech_Marcos.modelo.Productos;
import com.c3s4r310.ProyFourTech_Marcos.modelo.Usuario;
import com.c3s4r310.ProyFourTech_Marcos.repositorio.UsuarioRepository;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private ProductosServices services_pro;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/")
    public String inicio(Model model) {
        Integer idCategoria = 1; // ID para computadoras
        List<Productos> productos = services_pro.listarPorCategoria(idCategoria);
        model.addAttribute("productos", productos);
        return "index";
    }

    @GetMapping("/computadoras")
    public String listarPcs(Model model) {
        Integer idCategoria = 1; // ID para computadoras
        List<Productos> productos = services_pro.listarPorCategoria(idCategoria);
        model.addAttribute("productos", productos);
        return "computadoras";
    }

    @GetMapping("/laptops")
    public String listarLaptops(Model model) {
        Integer idCategoria = 2; // ID para laptops
        List<Productos> productos = services_pro.listarPorCategoria(idCategoria);
        model.addAttribute("productos", productos);
        return "laptops";
    }

    @GetMapping("/accesorios")
    public String listarAccesorios(Model model) {
        Integer idCategoria = 3; // ID para accesorios
        List<Productos> productos = services_pro.listarPorCategoria(idCategoria);
        model.addAttribute("productos", productos);
        return "accesorios";
    }

    @GetMapping("/registro")
    public String mostrarRegistro(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "registro";
    }

    @GetMapping("/usuarios")
    public String mostrarUsuariosRegistrados(Model model) {
        List<Usuario> usuarios = usuarioRepository.findAll();
        model.addAttribute("usuarios", usuarios);
        return "usuarios";
    }

    @PostMapping("/registro")
    public String registrarUsuario(@ModelAttribute Usuario usuario, RedirectAttributes redirectAttributes) {
        try {
            // Encriptar la contraseña antes de guardar
            usuario.setContra(passwordEncoder.encode(usuario.getContra()));
            
            // Guardar el usuario en la base de datos
            usuarioRepository.save(usuario);
            
            // Mensaje de éxito
            redirectAttributes.addFlashAttribute("mensaje", "Usuario registrado exitosamente");
            return "redirect:/login"; // Redirigir al login después del registro exitoso
            
        } catch (Exception e) {
            // Mensaje de error
            redirectAttributes.addFlashAttribute("error", "Error al registrar usuario: " + e.getMessage());
        }

        return "redirect:/registro"; // redirecciona después del registro
    }

    @GetMapping("/login")
    public String mostrarLogin() {
        return "login";
    }
}
