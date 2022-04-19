package com.detektor.vehiculos.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.detektor.vehiculos.dao.VehiculoRepository;
import com.detektor.vehiculos.models.Vehiculo;
import com.detektor.vehiculos.payloads.VehiculoRequest;
import com.detektor.vehiculos.services.IVehiculoService;

/**
 * @author adrian avendano concha
 * @email adrian.faconcha@gmail.com
 * @since 19/04/2021
 * @version 1
 */

@Service
public class VehiculoServiceImpl implements IVehiculoService {

	@Autowired
	private VehiculoRepository vehiculoRepository;

	@Override
	public List<Vehiculo> getAllVehiculos() {
		return vehiculoRepository.findAll();
	}

	@Override
	public Vehiculo addVehiculo(VehiculoRequest vehiculoRequest) {
		Vehiculo vehiculoSave = new Vehiculo(vehiculoRequest);
		vehiculoRepository.save(vehiculoSave);
		return vehiculoSave;
	}

	@Override
	public Vehiculo getVehiculo(Long id) {
		return vehiculoRepository.getById(id);
	}

	@Override
	public Vehiculo updateVehiculo(VehiculoRequest vehiculoRequest) {
		Vehiculo vehiculoUpdate = new Vehiculo(vehiculoRequest);
		vehiculoRepository.save(vehiculoUpdate);
		return vehiculoUpdate;
	}

	@Override
	public void deleteVehiculo(Long id) {
		vehiculoRepository.deleteById(id);
	}

	@Override
	public List<Vehiculo> getVehiculosByPropietario(Long id) {
		return vehiculoRepository.findVehiculosByPropietario(id);
	}

}
