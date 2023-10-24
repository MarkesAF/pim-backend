package com.pimbackend.entities;



import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import com.pimbackend.entities.Funcionario;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tbfolhapagamento",schema = "Oasis")
@EqualsAndHashCode(of = "id")
public class FolhaPagamento {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Double salario;

    private Double descontos;

    private Double bonus;

    @OneToOne
    @JoinColumn(name = "funcionario_id", referencedColumnName = "id")
    private Funcionario funcionario;
}

