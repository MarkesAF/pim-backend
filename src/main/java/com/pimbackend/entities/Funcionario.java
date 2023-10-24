package com.pimbackend.entities;


import com.pimbackend.dto.FuncionarioDTO;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;


@Entity
@EqualsAndHashCode(of = "id")
@Table(name = "tbfuncionario", schema = "Oasis")
public class Funcionario {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(unique = true, nullable = false, length = 11)
    private String cpf;
    @Column(nullable = false)
    private String cargo;
    private Double salario;


    public Funcionario(){
    }
    public Funcionario(Long id, String nome, String cpf, String cargo, Double salario){
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
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

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

}
