package com.example.retoJava.Controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.retoJava.Model.Buy;
import com.example.retoJava.Service.BuyService;

@RestController
@RequestMapping("buy")
public class BuyController {

    @Autowired
    BuyService buyService;
    
    @GetMapping("/all")
    public ArrayList<Buy> listar(){
        return buyService.listar();
    }
    
    @GetMapping("/all/{id}")
    public Optional<Buy> listarId(@PathVariable("id") long id){
        return buyService.listarId(id);
    }

    @PostMapping("/save")
    public Buy guardar(@RequestBody Buy b){
        return buyService.guardar(b);
    }

    @DeleteMapping("/delete/{id}")
    public String eliminar(@PathVariable("id") long id){
        if (buyService.eliminar(id)) {
            return "Se elimino";
        } else {
            return "no se elimino";
        }
    }
}
