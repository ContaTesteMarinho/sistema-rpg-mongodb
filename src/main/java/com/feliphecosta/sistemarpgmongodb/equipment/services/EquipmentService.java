package com.feliphecosta.sistemarpgmongodb.equipment.services;

import com.feliphecosta.sistemarpgmongodb.equipment.domain.Equipment;

import java.util.List;

public interface EquipmentService {

    List<Equipment> findAll();
}
