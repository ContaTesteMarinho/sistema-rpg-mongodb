package com.feliphecosta.sistemarpgmongodb.equipment.resource;

import com.feliphecosta.sistemarpgmongodb.equipment.domain.Equipment;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EquipmentResource {

    ResponseEntity<List<Equipment>> findAll();
}
