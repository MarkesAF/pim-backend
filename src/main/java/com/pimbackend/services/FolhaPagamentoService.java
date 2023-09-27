package com.pimbackend.services;

import com.pimbackend.entities.FolhaPagamento;
import com.pimbackend.entities.Funcionario;
import com.pimbackend.repository.FolhaPagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FolhaPagamentoService {

    @Autowired
    private FolhaPagamentoRepository rep;

    public List<FolhaPagamento> findAll(){
        return rep.findAll();
    }

}
