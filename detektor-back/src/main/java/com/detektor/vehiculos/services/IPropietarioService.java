package com.detektor.vehiculos.services;

import java.util.List;

import com.detektor.vehiculos.models.Propietario;
import com.detektor.vehiculos.payloads.PropietarioRequest;

/**
 * @author adrian avendano concha
 * @email adrian.faconcha@gmail.com
 * @since 19/04/2021
 * @version 1
 */

public interface IPropietarioService {

	List<Propietario> getAllPropietarios();

	Propietario addPropietario(PropietarioRequest propietarioRequest);

	Propietario getPropietario(Long id);

	Propietario updatePropietario(PropietarioRequest propietarioRequest);

	public void deletePropietario(Long id);

}
