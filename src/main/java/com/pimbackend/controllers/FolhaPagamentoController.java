package com.pimbackend.controllers;

import com.pimbackend.dto.FolhaPagamentoDTO;
import com.pimbackend.entities.FolhaPagamento;
import com.pimbackend.services.FolhaPagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;


@RestController
@RequestMapping(value = "/folha-de-pagamento")
public class FolhaPagamentoController {

    @Autowired
    private FolhaPagamentoService service;

    @GetMapping
    public ResponseEntity<List<FolhaPagamentoDTO>>findAll(){
        List<FolhaPagamentoDTO> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping("{id}")
    public ResponseEntity<FolhaPagamento> findById(@PathVariable Long id){
        FolhaPagamento obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
    @PostMapping("{cadastrar}")
    public ResponseEntity<FolhaPagamento>insert(@RequestBody FolhaPagamento fp){
        FolhaPagamento folha = service.insert(fp);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{id}").buildAndExpand(fp.getId()).toUri();
        return ResponseEntity.created(uri).body(folha);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        service.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("{id}")
    public ResponseEntity<FolhaPagamento> update(@PathVariable Long id, FolhaPagamento obj){
        FolhaPagamento fp = service.update(id,obj);
        return ResponseEntity.ok().body(fp);
    }


}
