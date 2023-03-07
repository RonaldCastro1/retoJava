package com.example.retoJava.Service;

import java.util.ArrayList;
import java.util.Optional;

import com.example.retoJava.Model.Usuario;

public interface UsuarioService {

    ArrayList<Usuario> findAll();
    Optional<Usuario> getUserById(long id);
    Usuario saveUser (Usuario u);
    boolean deleteUserById(long id);
}
