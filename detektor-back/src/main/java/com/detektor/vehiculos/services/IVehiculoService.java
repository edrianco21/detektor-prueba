package com.detektor.vehiculos.services;

import java.util.List;

import com.detektor.vehiculos.models.Vehiculo;
import com.detektor.vehiculos.payloads.VehiculoRequest;

/**
 * @author adrian avendano concha
 * @email adrian.faconcha@gmail.com
 * @since 19/04/2021
 * @version 1
 */

public interface IVehiculoService {

	List<Vehiculo> getAllVehiculos();

	List<Vehiculo> getVehiculosByPropietario(Long id);

	Vehiculo addVehiculo(VehiculoRequest vehiculoRequest);

	Vehiculo getVehiculo(Long id);

	Vehiculo updateVehiculo(VehiculoRequest vehiculoRequest);

	public void deleteVehiculo(Long id);
}
