package com.detektor.vehiculos.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.detektor.vehiculos.dao.PropietarioRepository;
import com.detektor.vehiculos.models.Propietario;
import com.detektor.vehiculos.payloads.PropietarioRequest;
import com.detektor.vehiculos.services.IPropietarioService;

/**
 * @author adrian avendano concha
 * @email adrian.faconcha@gmail.com
 * @since 19/04/2021
 * @version 1
 */

@Service
public class PropietarioServiceImpl implements IPropietarioService {

	@Autowired
	private PropietarioRepository propietarioRepository;
	
	@Override
	public List<Propietario> getAllPropietarios() {
		return propietarioRepository.findAll();
	}

	@Override
	public Propietario addPropietario(PropietarioRequest propietarioRequest) {
		Propietario propietarioSave = new Propietario(propietarioRequest);
		propietarioRepository.save(propietarioSave);
		return propietarioSave;
	}

	@Override
	public Propietario getPropietario(Long id) {
		return propietarioRepository.getById(id);
	}

	@Override
	public Propietario updatePropietario(PropietarioRequest propietarioRequest) {
		Propietario propietarioUpdate = new Propietario(propietarioRequest);
		propietarioRepository.save(propietarioUpdate);
		return propietarioUpdate;
	}

	@Override
	public void deletePropietario(Long id) {
		propietarioRepository.deleteById(id);
	}


}
