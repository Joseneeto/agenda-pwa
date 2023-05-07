package com.api.contatos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.contatos.model.ContatoModel;

@Repository
public interface ContatoRepository extends CrudRepository<ContatoModel, Long> {
    
}
