package br.com.fiap3espg.spring_boot_project.aluno;

import br.com.fiap3espg.spring_boot_project.endereco.Endereco;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroAluno(

        @NotBlank
        String nome,

        @NotBlank
        @Email
        String email,

        @NotBlank
        String telefone,

        @NotBlank
        String cpf,

        @NotNull
        Endereco endereco
) {}
