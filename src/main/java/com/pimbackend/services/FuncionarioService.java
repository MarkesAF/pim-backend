package com.pimbackend.services;


import com.pimbackend.entities.Funcionario;
import com.pimbackend.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository rep;

    public List<Funcionario> getFuncionarios(){
        return rep.findAll();
    }
}
