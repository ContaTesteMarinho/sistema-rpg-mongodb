package com.feliphecosta.sistemarpgmongodb.classe.resource;

import com.feliphecosta.sistemarpgmongodb.classe.dto.ClasseDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ClasseResource {

    ResponseEntity<List<ClasseDTO>> findAll();
}
