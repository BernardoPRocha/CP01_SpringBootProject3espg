package br.com.fiap3espg.spring_boot_project.controller;

import br.com.fiap3espg.spring_boot_project.instrutor.*;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/instrutores")
public class InstrutorController {

    @Autowired
    private InstrutorRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroInstrutor dados) {
        repository.save(new Instrutor(
                null,
                dados.nome(),
                dados.email(),
                dados.telefone(),   // agora existe ✅
                dados.cnh(),
                dados.especialidade(),
                dados.endereco(),
                true
        ));
    }

    @GetMapping
    public Page<DadosListagemInstrutor> listar(
            @PageableDefault(size = 10, sort = {"nome"}) Pageable pageable) {
        return repository.findAllByAtivoTrue(pageable)
                .map(DadosListagemInstrutor::new);
    }

    @PutMapping("/{id}")
    @Transactional
    public void atualizar(@PathVariable Long id, @RequestBody DadosAtualizacaoInstrutor dados) {
        var instrutor = repository.getReferenceById(id);
        instrutor.atualizar(dados.nome(), dados.telefone(), dados.endereco());
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        var instrutor = repository.getReferenceById(id);
        instrutor.setAtivo(false);
    }
}
