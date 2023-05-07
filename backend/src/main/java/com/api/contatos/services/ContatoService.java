package com.api.contatos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.contatos.model.ContatoModel;
import com.api.contatos.model.RespostaModel;
import com.api.contatos.repository.ContatoRepository;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository repository;

    @Autowired
    private RespostaModel response;

    //método para listar todos os contatos
    public Iterable<ContatoModel> listar(){
        return repository.findAll();
    }

    //método para cadastrar ou alterar contatos
    public ResponseEntity<?> cadastrarAlterar(ContatoModel contato, String acao){

        if(contato.getName().equals("")){
            response.setMensagem("O nome do contato é obrigatório!");
            return new ResponseEntity<RespostaModel>(response, HttpStatus.BAD_REQUEST);
        }else if(contato.getEmail().equals("")){
            response.setMensagem("O email do contato é obrigatório!");
            return new ResponseEntity<RespostaModel>(response, HttpStatus.BAD_REQUEST);
        }else if(contato.getPhone().equals("")){
            response.setMensagem("O telefone do contato é obrigatório!");
            return new ResponseEntity<RespostaModel>(response, HttpStatus.BAD_REQUEST);
        }else{
            if(acao.equals("cadastrar")){
                return new ResponseEntity<ContatoModel>(repository.save(contato), HttpStatus.CREATED);
            }else{
                return new ResponseEntity<ContatoModel>(repository.save(contato), HttpStatus.OK);
            }
        }

    }  

    //método para remover produtos
    public ResponseEntity<RespostaModel> remover(Long id){
        repository.deleteById(id);

        response.setMensagem("O contato foi removido com sucesso!");
        return new ResponseEntity<RespostaModel>(response, HttpStatus.OK);
    }
    
}