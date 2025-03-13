package uea.edu.br.pagamentos_api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uea.edu.br.pagamentos_api.dto.PessoaDTO;
import uea.edu.br.pagamentos_api.service.PessoaService;

@RestController
@RequestMapping("/pessoas")
public class PessoaController {

    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    // GET /pessoas
    @GetMapping
    public List <PessoaDTO> listarPessoas() {
        return pessoaService.listarPessoas();
    }

    // GET /pessoas/{codigo}
    @GetMapping("/{codigo}")
    public PessoaDTO buscarPessoa(@PathVariable Long codigo) {
        return pessoaService.buscarPessoaPorCodigo(codigo);
    }

    // POST /pessoas
    @PostMapping
    public ResponseEntity<PessoaDTO> criarPessoa(@RequestBody PessoaDTO pessoaDTO) {
        PessoaDTO pessoaCriada = pessoaService.criarPessoa(pessoaDTO);
        return new ResponseEntity<>(pessoaCriada, HttpStatus.CREATED);
    }

    // PUT /pessoas/{codigo}
    @PutMapping("/{codigo}")
    public PessoaDTO atualizarPessoa(@PathVariable Long codigo, @RequestBody PessoaDTO pessoaDTO) {
        return pessoaService.atualizarPessoa(codigo, pessoaDTO);
    }

    // DELETE /pessoas/{codigo}
    @DeleteMapping("/{codigo}")
    public ResponseEntity<Void> deletarPessoa(@PathVariable Long codigo) {
        pessoaService.deletarPessoa(codigo);
        return ResponseEntity.noContent().build();
    }

    // PATCH /pessoas/{codigo}/ativo
    @PatchMapping("/{codigo}/ativo")
    public PessoaDTO atualizarStatus(@PathVariable Long codigo, @RequestBody Boolean ativo) {
        return pessoaService.atualizarStatus(codigo, ativo);
    }
}
