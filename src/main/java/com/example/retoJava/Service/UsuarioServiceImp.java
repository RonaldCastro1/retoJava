package com.example.retoJava.Service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.example.retoJava.Model.Usuario;
import com.example.retoJava.Repository.UsuarioRepository;

@Service
public class UsuarioServiceImp implements UsuarioService{

    @Autowired
    UsuarioRepository usuarioRepository;


    @Override
    public ArrayList<Usuario> findAll() {
        return (ArrayList<Usuario>) usuarioRepository.findAll();
    }

    @Override
    public Page<Usuario> findAll(Pageable pageable) {
        return (Page<Usuario>) usuarioRepository.findAll(pageable);}

    @Override
    public Optional<Usuario> getUserById(long id) {
        return usuarioRepository.findById(id);
    }

    @Override
    public Usuario saveUser(Usuario u) {
        return usuarioRepository.save(u);
    }

    @Override
    public boolean deleteUserById(long id) {
        try{
            Optional<Usuario> u = getUserById(id);
            usuarioRepository.delete(u.get());
            return true;
        }catch(Exception e){
            return false;
        }
    }

    /* @Override
    public Page<Usuario> findAll(Pageable pageable) throws Exception {
        return (Page<Usuario>) usuarioRepository.findAll(pageable);
    } */
    
}
