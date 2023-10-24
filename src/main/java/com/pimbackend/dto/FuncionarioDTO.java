package com.pimbackend.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record FuncionarioDTO(@NotBlank @NotNull Long id, String nome, String cargo) {
    }
