package com.pimbackend.services;


import com.pimbackend.entities.Funcionario;
import com.pimbackend.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

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
    public Funcionario insert(Funcionario funcionario){
        return rep.save(funcionario);
    }
    public Funcionario update(@PathVariable Long id, @RequestBody Funcionario obj){
        Funcionario fun = rep.getReferenceById(id);
        updateData(fun,obj);
        return rep.save(fun);
    }
    public void updateData(Funcionario fun, Funcionario obj){
        fun.setCargo(obj.getCargo());
        fun.setSalarioBase(obj.getSalarioBase());
    }

}
