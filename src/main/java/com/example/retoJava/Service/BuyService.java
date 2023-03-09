package com.example.retoJava.Service;

import java.util.ArrayList;
import java.util.Optional;

import com.example.retoJava.Model.Buy;

public interface BuyService {
    ArrayList<Buy> listar();
    Optional<Buy> listarId(Long id);
    Buy guardar(Buy b);
    boolean eliminar(long id);
}
