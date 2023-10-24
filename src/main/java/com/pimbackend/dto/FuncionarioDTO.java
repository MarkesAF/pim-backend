package com.pimbackend.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;


public record FuncionarioDTO(@NotBlank @NotNull Long id, String nome, String cargo) {
    }
