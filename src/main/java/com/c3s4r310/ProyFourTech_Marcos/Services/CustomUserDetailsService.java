package com.c3s4r310.ProyFourTech_Marcos.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.c3s4r310.ProyFourTech_Marcos.modelo.Usuario;
import com.c3s4r310.ProyFourTech_Marcos.repositorio.UsuarioRepository;

@Service("customUserDetailsService")
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByEmail(email);
        
        if (usuario == null) {
            throw new UsernameNotFoundException("Usuario no encontrado: " + email);
        }
        
        // Usar el nombre completo como username para mostrar en la interfaz
        String nombreCompleto = usuario.getNombres() + " " + usuario.getApellidos();
        
        return User.builder()
                .username(nombreCompleto) // Mostrar nombre completo en lugar del email
                .password(usuario.getContra()) // Usar getContra() en lugar de getPassword()
                .authorities("USER")
                .build();
    }
}
