package com.pimbackend.dto;

public record FolhaPagamentoDTO(Long id, Long funcionarioId, String nome,String cargo, Double salario, Double bonus, Double descontos) {
}
