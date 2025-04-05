package br.com.fiap.apisecurity.dto;

import br.com.fiap.apisecurity.model.UserRole;

public record RegisterDTO(
        String username,
        String password,
        UserRole role
) {
}
