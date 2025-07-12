
<<<<<<< HEAD
package com.c3s4r310.ProyFourTech_Marcos.Controlador;
=======
package com.c3s4r310.ProyFourTech_Marcos.controlador;
>>>>>>> 3c9c43d (Consolidación: Recuperar versión con style.css + Spring Security + mejoras actuales)

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
import com.c3s4r310.ProyFourTech_Marcos.repositorio.Repository; // Importa tu repositorio

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private Repository usuarioRepository; // Renombrado a usuarioRepository para claridad

    @Autowired
    private ProductosServices services_pro;
<<<<<<< HEAD
=======

    @Autowired
    private PasswordEncoder passwordEncoder;
>>>>>>> 3c9c43d (Consolidación: Recuperar versión con style.css + Spring Security + mejoras actuales)

    @GetMapping("/")
    public String mostrarPaginaPrincipal() {
        return "index.html"; // Nombre de la plantilla
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
    }

    @GetMapping("/registro")
    public String mostrarRegistro(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "registro";
    }

    @GetMapping("/usuarios_registrados")
    public String mostrarUsuariosRegistrados(Model model) { // ¡Aquí el cambio! Necesitas Model
        // Obtiene todos los usuarios de la base de datos
        List<Usuario> usuarios = usuarioRepository.findAll();
        
        // Agrega la lista de usuarios al modelo para que Thymeleaf la use
        model.addAttribute("usuarios", usuarios); 
        
        return "usuarios_registrados.html"; // Nombre de la plantilla
    }

    @PostMapping("/registrarUsuario")
    public String registrarUsuario(@ModelAttribute Usuario usuario, RedirectAttributes redirectAttributes) {

<<<<<<< HEAD
=======
        // Encriptar la contraseña antes de guardar
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
>>>>>>> 3c9c43d (Consolidación: Recuperar versión con style.css + Spring Security + mejoras actuales)
        usuarioRepository.save(usuario);

        // Enviar mensaje de éxito al redirigir
        redirectAttributes.addFlashAttribute("mensajeExito", "¡Usuario registrado correctamente!");

        return "redirect:/registro"; // redirecciona después del registro
    }

<<<<<<< HEAD
=======
    @GetMapping("/login")
    public String mostrarLogin() {
        return "login";
    }

>>>>>>> 3c9c43d (Consolidación: Recuperar versión con style.css + Spring Security + mejoras actuales)
}