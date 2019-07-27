package com.feliphecosta.sistemarpgmongodb.classe.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.feliphecosta.sistemarpgmongodb.classe.domain.Classe;

@Repository
public interface ClasseRepository extends MongoRepository<Classe, String> {

}
