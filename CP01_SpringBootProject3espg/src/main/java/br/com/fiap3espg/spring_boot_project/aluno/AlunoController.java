package br.com.fiap3espg.spring_boot_project.aluno;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroAluno dados) {
        repository.save(new Aluno(
                null,
                dados.nome(),
                dados.cpf(),
                dados.endereco(),
                true
        ));
    }

    @GetMapping
    public Page<DadosListagemAluno> listar(
            @PageableDefault(size = 10, sort = {"nome"}) Pageable pageable) {
        return repository.findAllByAtivoTrue(pageable)
                .map(DadosListagemAluno::new);
    }

    @PutMapping("/{id}")
    @Transactional
    public void atualizar(@PathVariable Long id, @RequestBody DadosAtualizacaoAluno dados) {
        var aluno = repository.getReferenceById(id);
        aluno.atualizar(dados.nome(), dados.telefone(), dados.endereco());
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        var aluno = repository.getReferenceById(id);
        aluno.setAtivo(false);
    }
}
