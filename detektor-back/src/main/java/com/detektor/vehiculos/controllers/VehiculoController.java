package com.detektor.vehiculos.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.detektor.vehiculos.models.Vehiculo;
import com.detektor.vehiculos.payloads.VehiculoRequest;
import com.detektor.vehiculos.payloads.response.VehiculoMappingResponse;
import com.detektor.vehiculos.services.IVehiculoService;

/**
 * @author adrian avendano concha
 * @email adrian.faconcha@gmail.com
 * @since 19/04/2021
 * @version 1
 */

@RestController
@RequestMapping("/api/vehiculos")
@CrossOrigin(origins = "http://localhost:4200", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE})
public class VehiculoController {

	@Autowired
	private IVehiculoService vehiculoService;

	@GetMapping
	public List<VehiculoMappingResponse> getAllVehiculos() {
		try {
			List<Vehiculo> vehiculos = vehiculoService.getAllVehiculos();
			List<VehiculoMappingResponse> response = new ArrayList<VehiculoMappingResponse>();
			for (Vehiculo veh : vehiculos) {
				response.add(new VehiculoMappingResponse(veh));
			}
			return response;
		} catch (Exception e) {
			return null;
		}
	}

	@GetMapping("propietario/{id}")
	public List<VehiculoMappingResponse> getVehiculosByPropietario(@PathVariable(name = "id") Long id) {
		try {
			List<Vehiculo> vehiculos = vehiculoService.getVehiculosByPropietario(id);
			List<VehiculoMappingResponse> response = new ArrayList<VehiculoMappingResponse>();
			for (Vehiculo veh : vehiculos) {
				response.add(new VehiculoMappingResponse(veh));
			}
			return response;
		} catch (Exception e) {
			return null;
		}
	}
	
	@PostMapping
	public VehiculoMappingResponse addVehiculo(@RequestBody VehiculoRequest vehiculoRequest) {
		try {
			System.out.println("entro a addVehiculo");
			return new VehiculoMappingResponse(vehiculoService.addVehiculo(vehiculoRequest));
		} catch (Exception e) {
			return null;
		}
	}

	@PutMapping
	public VehiculoMappingResponse updateVehiculo(@RequestBody VehiculoRequest vehiculoRequest) {
		try {
			return new VehiculoMappingResponse(vehiculoService.updateVehiculo(vehiculoRequest));
		} catch (Exception e) {
			return null;
		}
	}

	@GetMapping("/{id}")
	public VehiculoMappingResponse getVehiculoById(@PathVariable(name = "id") Long id) {
		try {
			return new VehiculoMappingResponse(vehiculoService.getVehiculo(id));
		} catch (Exception e) {
			return null;
		}
	}

	@DeleteMapping("/{id}")
	public String deleteVehiculoById(@PathVariable(name = "id") Long id) {
		try {
			System.out.println("entro a deleteVehiculoById");
			vehiculoService.deleteVehiculo(id);
			return "Ok";
		} catch (Exception e) {
			return "Error: " + e;
		}
	}
}
