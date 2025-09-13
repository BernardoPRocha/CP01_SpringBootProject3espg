package br.com.fiap3espg.spring_boot_project.aluno;

import br.com.fiap3espg.spring_boot_project.endereco.Endereco;

public record DadosAtualizacaoAluno(
        String nome,
        String telefone,
        Endereco endereco
) {}
