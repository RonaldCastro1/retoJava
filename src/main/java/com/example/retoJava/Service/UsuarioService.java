package com.example.retoJava.Service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.example.retoJava.Model.Usuario;

public interface UsuarioService {

    ArrayList<Usuario> findAll();
    Optional<Usuario> getUserById(long id);
    Usuario saveUser (Usuario u);
    boolean deleteUserById(long id);
    Page<Usuario> findAll(Pageable pageable);
    /* Page<Usuario> findAll(Pageable pageable) throws Exception; */
    
    
}
