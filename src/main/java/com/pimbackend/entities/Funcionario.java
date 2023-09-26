package com.pimbackend.entities;


import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Objects;


@Entity
@Table(name = "tbfuncionario", schema = "pim")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nmfuncionario")
    private String nome;

    @Column(name = "cpffuncionario")
    private String cpf;

    @Column(name = "cargofuncionario")
    private String cargo;

    @Column(name = "dtcontratacao")
    private LocalDate dtContratacao;

    @Column(name = "vlsalariobase")
    private Double salarioBase;

    public Funcionario(){
    }
    public Funcionario(Long id, String nome, String cpf, String cargo, LocalDate dtContratacao, Double salarioBase){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dtContratacao = dtContratacao;
        this.salarioBase = salarioBase;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public LocalDate getDtContratacao() {
        return dtContratacao;
    }

    public void setDtContratacao(LocalDate dtContratacao) {
        this.dtContratacao = dtContratacao;
    }

    public Double getVlSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Funcionario that)) return false;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
