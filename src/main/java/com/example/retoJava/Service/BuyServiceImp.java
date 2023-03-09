package com.example.retoJava.Service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.retoJava.Model.Buy;
import com.example.retoJava.Repository.BuyRepository;

@Service
public class BuyServiceImp implements BuyService{

    @Autowired
    BuyRepository buyRepository;
    @Override
    public ArrayList<Buy> listar() {
        return (ArrayList<Buy>) buyRepository.findAll();
    }

    @Override
    public Optional<Buy> listarId(Long id) {
        return buyRepository.findById(id);
    }

    @Override
    public Buy guardar(Buy b) {
        return buyRepository.save(b);
    }

    @Override
    public boolean eliminar(long id) {
        try {
            Optional<Buy> b = listarId(id);
            buyRepository.delete(b.get());
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
