package com.pimbackend.services;


import com.pimbackend.entities.Funcionario;
import com.pimbackend.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository rep;

    public List<Funcionario> getFuncionarios(){
        return rep.findAll();
    }
    public Funcionario findById(Long id){
        Optional<Funcionario> obj = rep.findById(id);
        return obj.get();
    }

}
