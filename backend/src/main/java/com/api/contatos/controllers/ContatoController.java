package com.api.contatos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.contatos.model.ContatoModel;
import com.api.contatos.model.RespostaModel;
import com.api.contatos.services.ContatoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins = "*")
@Api(value = "API REST contatos")
public class ContatoController {

    @Autowired
    private ContatoService service;

    @ApiOperation(value = "Remove um contato")
    @DeleteMapping("/remover/{id}")
    public ResponseEntity<RespostaModel> remover(@PathVariable Long id){
        return service.remover(id);
    }

    @ApiOperation(value = "Altera um contato")
    @PutMapping("/alterar")
    public ResponseEntity<?> alterar(@RequestBody ContatoModel contato){
        return service.cadastrarAlterar(contato, "alterar");
    }

    @ApiOperation(value = "Salva um novo contato")
    @PostMapping("/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody ContatoModel contato){
        return service.cadastrarAlterar(contato, "cadastrar");
    }

    @ApiOperation(value = "Lista todos os contatos")
    @GetMapping("/listar")
    public Iterable<ContatoModel> listar(){
        return service.listar();
    }

    @GetMapping("/")
    public String rotas(){
        return "Api de contatos funcionando!";
    }
    
}
