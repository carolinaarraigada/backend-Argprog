
package com.miapp.springboot.service;

import com.miapp.springboot.model.Usuario;
import java.util.List;


public interface IUsuarioService {
    public List <Usuario> verUsuarios();
    public void crearUsuario (Usuario us);
    public void updateUsuario (Usuario us);
    public void borrarUsuario (Long id);
    public Usuario buscarUsuario(Long id);
    public Usuario buscaUsuarioByUser(String us);
}
