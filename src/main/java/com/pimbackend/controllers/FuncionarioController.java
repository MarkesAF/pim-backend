package com.pimbackend.controllers;

import com.pimbackend.dto.FuncionarioDTO;
import com.pimbackend.entities.FolhaPagamento;
import com.pimbackend.entities.Funcionario;
import com.pimbackend.repository.FuncionarioRepository;
import com.pimbackend.services.FuncionarioService;
import jdk.jshell.Snippet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.net.ssl.SSLEngineResult;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/funcionarios")
public class FuncionarioController {
    @Autowired
    private FuncionarioService service;


    @GetMapping
    public ResponseEntity<List<FuncionarioDTO>> findAll(){
        List<FuncionarioDTO> list = service.getFuncionarios();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping("/{cadastrar}")
    public ResponseEntity<Funcionario> insert(@RequestBody Funcionario funcionario){
        Funcionario obj = service.insert(funcionario);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }
    @PutMapping(value = "/{id}")
    public ResponseEntity<Funcionario> update(@PathVariable Long id, Funcionario obj){
        Funcionario fun = service.update(id,obj);
        return ResponseEntity.ok().body(fun);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }



}
