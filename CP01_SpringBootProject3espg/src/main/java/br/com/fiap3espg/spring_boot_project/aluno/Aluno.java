package br.com.fiap3espg.spring_boot_project.aluno;

import br.com.fiap3espg.spring_boot_project.endereco.Endereco;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Alunos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true, nullable = false)
    private String email;

    private String telefone;

    @Column(unique = true, nullable = false)
    private String cpf;

    @Embedded
    private Endereco endereco;

    @Column(nullable = false)
    private Boolean ativo = true;

    public void atualizar(String nome, String telefone, Endereco endereco) {
        if (nome != null) this.nome = nome;
        if (telefone != null) this.telefone = telefone;
        if (endereco != null) this.endereco.atualizar(endereco);
    }
}
