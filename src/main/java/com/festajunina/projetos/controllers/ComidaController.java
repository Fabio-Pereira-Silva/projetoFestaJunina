package com.festajunina.projetos.controllers;
import com.festajunina.projetos.domain.Comida;
import com.festajunina.projetos.services.ComidaService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping(value = "/comida")
public class ComidaController {
    @Autowired
    private ComidaService comidaService;
    @ApiResponses(value = @ApiResponse(responseCode = "200", description = "status 200 Ok"))
    @GetMapping
    public ResponseEntity<List<Comida>> findAll(){
        List<Comida> list = comidaService.findAll();
        return ResponseEntity.ok().body(list);
    }
    @ApiResponses(value = @ApiResponse(responseCode = "200", description = "status 200 Ok"))
    @GetMapping(value = "/{id}")
    public ResponseEntity<Comida> findById(@PathVariable Long id){
        Comida obj = (Comida) comidaService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
    @ApiResponses(value = @ApiResponse(responseCode = "200", description = "status 200 Ok Insert"))
    @PostMapping
    public ResponseEntity<Comida> insert(@RequestBody Comida obj){
        obj = comidaService.insert(obj);
        return ResponseEntity.ok().body(obj);
    }
    @ApiResponses(value = @ApiResponse(responseCode = "200", description = "status 200 Ok Update"))
    @PutMapping(value = "/{id}")
    public ResponseEntity<Comida> update(@PathVariable Long id, @RequestBody Comida obj){
        obj = comidaService.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }

    @ApiResponses(value = @ApiResponse(responseCode = "200", description = "status 200 Ok Delete"))
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        comidaService.delete(id);
        return ResponseEntity.noContent().build();
    }

    // Endereço Swagger:
    //http://localhost:8080/swagger-ui/index.html

    // Endereço H2 console
    // http://localhost:8080/h2-console
}
