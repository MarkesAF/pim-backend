package com.pimbackend.entities;


import jakarta.persistence.*;
import lombok.*;
import com.pimbackend.entities.Funcionario;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tbfolhapagamento",schema = "pim")
@EqualsAndHashCode
public class FolhaPagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idfolhapagamento")
    private Long id;

    @Column(name = "dtreferencia")
    private LocalDate dtReferencia;


    @Column(name = "vlbase")
    private Double vlBase;


    @Column(name = "vldescontos")
    private Double vlDescontos;


    @Column(name = "vlbonus")
    private Double vlBonus;


    @MapsId("idfuncionario")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idfuncionario", referencedColumnName = "idfuncionario")
    private Funcionario funcionario;

    public FolhaPagamento(){
    }
    public FolhaPagamento(Long id,Funcionario fun,LocalDate dtReferencia, Double vlBase, Double vlDescontos, Double vlBonus ){
        this.id = id;
        fun.getId();
        this.dtReferencia = dtReferencia;
        this.vlBase = vlBase;
        this.vlDescontos = vlDescontos;
        this.vlBonus = vlBonus;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public LocalDate getDtReferencia() {
        return dtReferencia;
    }

    public void setDtReferencia(LocalDate dtReferencia) {
        this.dtReferencia = dtReferencia;
    }

    public Double getVlBase() {
        return vlBase;
    }

    public void setVlBase(Double vlBase) {
        this.vlBase = vlBase;
    }

    public Double getVlDescontos() {
        return vlDescontos;
    }

    public void setVlDescontos(Double vlDescontos) {
        this.vlDescontos = vlDescontos;
    }

    public Double getVlBonus() {
        return vlBonus;
    }

    public void setVlBonus(Double vlBonus) {
        this.vlBonus = vlBonus;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario){
        funcionario.setId(funcionario.getId());
    }
}
