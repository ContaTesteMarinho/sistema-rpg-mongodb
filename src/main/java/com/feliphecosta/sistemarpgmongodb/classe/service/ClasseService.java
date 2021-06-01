package com.feliphecosta.sistemarpgmongodb.classe.service;

import com.feliphecosta.sistemarpgmongodb.classe.dto.ClasseDTO;

import java.util.List;

public interface ClasseService {

    List<ClasseDTO> findAll();
}
