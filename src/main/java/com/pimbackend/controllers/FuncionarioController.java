package com.pimbackend.controllers;

import com.pimbackend.entities.Funcionario;
import com.pimbackend.services.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/funcionarios")
public class FuncionarioController {
    @Autowired
    private FuncionarioService service;

    @GetMapping
    public ResponseEntity<List<Funcionario>> findAll(){
        List<Funcionario> list = service.getFuncionarios();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping("{id}")
    public ResponseEntity<Funcionario> findById(@PathVariable Long id){
        Funcionario obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }


}
