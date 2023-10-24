package com.pimbackend.services;


import com.pimbackend.dto.FolhaPagamentoDTO;
import com.pimbackend.entities.FolhaPagamento;
import com.pimbackend.repository.FolhaPagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;


@Service
public class FolhaPagamentoService {

    @Autowired
    private FolhaPagamentoRepository rep;

    public List<FolhaPagamentoDTO> findAll(){
        List<FolhaPagamento> list = rep.findAll();
        List<FolhaPagamentoDTO> dto = new ArrayList<>();
        for(FolhaPagamento fp : list){
            dto.add(new FolhaPagamentoDTO(
                    fp.getId(),
                    fp.getFuncionario().getId(),
                    fp.getFuncionario().getNome(),
                    fp.getFuncionario().getCargo(),
                    fp.getSalario(),
                    fp.getBonus(),
                    fp.getDescontos()
            ));
        }
        return dto;
    }
    public FolhaPagamento findById(@PathVariable Long id){
       return rep.findById(id).get();
    }
    public FolhaPagamento insert(FolhaPagamento fp){
        return rep.save(fp);
    }
    public void delete(Long id){
        rep.deleteById(id);
    }
    public FolhaPagamento update(@PathVariable Long id, @RequestBody FolhaPagamento obj){
        FolhaPagamento fp = rep.getReferenceById(id);
        updateData(fp,obj);
        return rep.save(fp);
    }

    public void updateData(FolhaPagamento fp, FolhaPagamento obj) {
        fp.setBonus(obj.getBonus());
        fp.setSalario(obj.getSalario());
        fp.setDescontos(obj.getDescontos());
    }
}
