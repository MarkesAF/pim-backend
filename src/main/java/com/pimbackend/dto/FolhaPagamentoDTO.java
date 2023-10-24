package com.pimbackend.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record FolhaPagamentoDTO(
        Long id,
        Long funcionarioId,
        String nome,
        String cargo,
        @NotBlank @NotNull
        Double salario,
        Double bonus,
        Double descontos) {
}
