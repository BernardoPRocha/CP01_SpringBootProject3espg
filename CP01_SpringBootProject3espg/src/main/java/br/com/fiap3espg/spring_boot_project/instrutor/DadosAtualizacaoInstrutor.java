package br.com.fiap3espg.spring_boot_project.instrutor;

import br.com.fiap3espg.spring_boot_project.endereco.Endereco;

public record DadosAtualizacaoInstrutor(
        String nome,
        String telefone,
        Endereco endereco
) {}
