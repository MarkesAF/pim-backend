package com.pimbackend.controllers;

import com.pimbackend.entities.FolhaPagamento;
import com.pimbackend.services.FolhaPagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/folhadepagamento")
public class FolhaPagamentoController {

    @Autowired
    private FolhaPagamentoService service;

    @GetMapping
    public ResponseEntity<List<FolhaPagamento>>findAll(){
        List<FolhaPagamento> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
}
