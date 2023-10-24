package com.pimbackend.services;


import com.pimbackend.dto.FuncionarioDTO;
import com.pimbackend.entities.Funcionario;
import com.pimbackend.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.ArrayList;
import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository rep;

    public List<FuncionarioDTO> getFuncionarios(){
        List<Funcionario> list = rep.findAll();
        List<FuncionarioDTO> dto = new ArrayList<>();
        for(Funcionario fun : list){
            dto.add(new FuncionarioDTO(
                    fun.getId(),
                    fun.getNome(),
                    fun.getCargo()
            ));
        }
        return dto;
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
        fun.setSalario(obj.getSalario());
    }
    public void delete(Long id){
      rep.deleteById(id);
    }
}
