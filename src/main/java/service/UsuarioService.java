/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.Usuario;
import repository.UsuarioRepository;

/**
 *
 * @author berna
 */
public class UsuarioService {
    private UsuarioRepository usuarioRepository;
    
    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    
    public void criarUsuario(String email, String senha) {
        long totalUsuarios = usuarioRepository.totalUsuarios();
        
        Usuario novoUsuario = new Usuario(email, senha);
        
        if (totalUsuarios == 0){
            novoUsuario.setAdmin(true);
        }
        
        usuarioRepository.salvarUsuario(novoUsuario);
    }
}
