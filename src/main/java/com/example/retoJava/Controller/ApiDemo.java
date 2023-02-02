package com.example.retoJava.Controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.jaxb.PageAdapter;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.retoJava.Model.Usuario;
import com.example.retoJava.Service.UsuarioService;

@RestController
@RequestMapping("api")
public class ApiDemo {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("saludar")
    public String saludar(){
        return "Hola mundo GG";
    }

    @GetMapping("/all")
    public ArrayList<Usuario> findAll(){
        return usuarioService.findAll();
    }

    @GetMapping("/all/{page}")
    public Page<Usuario> findAll(@PathVariable Integer page){
        return usuarioService.findAll(PageRequest.of(0, 5));
    }

    @GetMapping("/find/{id}")
    public Optional<Usuario> getUserById(@PathVariable("id") long id){
        return usuarioService.getUserById(id);
    }

    /* @GetMapping("/page")
    public ArrayList<Usuario> getAllUser(Pageable pageable){
        return usuarioService.getAllUser();
    } */

    @PostMapping("/save")
    public Usuario saveUser(@Validated @RequestBody Usuario u){
        return usuarioService.saveUser(u);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUserId(@PathVariable("id") long id){
        
        if(usuarioService.deleteUserById(id))
            return "Se elimino el usuario";
        
        else
            return "No se elimino el usuario";
    }
}
