package com.pimbackend.entities;



import jakarta.persistence.*;
import lombok.*;
import com.pimbackend.entities.Funcionario;

@Entity
@Table(name = "tbfolhapagamento",schema = "Oasis")
@EqualsAndHashCode(of = "id")
public class FolhaPagamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double salario;
    private Double descontos;
    private Double bonus;
    @OneToOne
    @JoinColumn(name = "funcionario_id", referencedColumnName = "id")
    private Funcionario funcionario;

    public FolhaPagamento(){
    }
    public FolhaPagamento(Long id, Double salario, Double descontos, Double bonus, Funcionario funcionario){
        this.id = id;
        this.salario = salario;
        this.descontos = descontos;
        this.bonus = bonus;
        this.funcionario = funcionario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getDescontos() {
        return descontos;
    }

    public void setDescontos(Double descontos) {
        this.descontos = descontos;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}

