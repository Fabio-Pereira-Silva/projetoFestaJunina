package com.festajunina.projetos.controllers;
import com.festajunina.projetos.domain.Pessoa;
import com.festajunina.projetos.dto.PessoaDTO;
import com.festajunina.projetos.services.PessoaService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(value = "/pessoa")
public class PessoaController {
    @Autowired
    private PessoaService pessoaService;
    @Autowired
    private PessoaService service;

    @ApiResponses(value = @ApiResponse(responseCode = "200", description = "status 200 Ok"))
    @GetMapping
    public ResponseEntity<List<Pessoa>> findAll(){
        List<Pessoa> list = pessoaService.findAll();
        return ResponseEntity.ok().body(list);
    }
    @ApiResponses(value = @ApiResponse(responseCode = "200", description = "status 200 Ok"))
    @GetMapping(value = "/{id}")
    public PessoaDTO findById(@PathVariable Long id){
        return service.findById(id);
    }
    @ApiResponses(value = @ApiResponse(responseCode = "200", description = "status 200 Ok Insert"))
    @PostMapping
    public ResponseEntity<PessoaDTO> insert(@RequestBody PessoaDTO obj){
        obj = pessoaService.insert(obj);
        return ResponseEntity.ok().body(obj);
    }
    @ApiResponses(value = @ApiResponse(responseCode = "200", description = "status 200 Ok Update"))
    @PutMapping
    public ResponseEntity<PessoaDTO> update(@RequestBody PessoaDTO obj){
        obj = pessoaService.update(obj);
        return ResponseEntity.ok().body(obj);
    }
    @ApiResponses(value = @ApiResponse(responseCode = "200", description = "status 200 Ok Delete"))
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        pessoaService.delete(id);
        return ResponseEntity.noContent().build();
    }
    @ApiResponses(value = @ApiResponse(responseCode = "200", description = "status 200 Ok AtualizaPagamento"))
    @PutMapping(value = "/atualizar/pagamento/{id}")
    public PessoaDTO atualizaPagamento(@PathVariable Long id){
        return service.atualizaPagamento(id);
    }
    @ApiResponses(value = @ApiResponse(responseCode = "200", description = "status 200 Ok associarComida"))
    @PutMapping(value = "/associar/comida/{idPessoa}/{idComida}")
    public PessoaDTO associarComida(@PathVariable Long idPessoa ,@PathVariable Long idComida){
        return service.associarComida(idPessoa,idComida);
    }

    // Endereço Swagger:
    //http://localhost:8080/swagger-ui/index.html

    // Endereço H2 console
    // http://localhost:8080/h2-console
}
