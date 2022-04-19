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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import com.detektor.vehiculos.models.Propietario;
import com.detektor.vehiculos.payloads.PropietarioRequest;
import com.detektor.vehiculos.payloads.response.PropietarioMappingResponse;
import com.detektor.vehiculos.services.IPropietarioService;

/**
 * @author adrian avendano concha
 * @email adrian.faconcha@gmail.com
 * @since 19/04/2021
 * @version 1
 */

@RestController
@RequestMapping("/api/propietarios")
@CrossOrigin(origins = "http://localhost:4200", methods= {RequestMethod.GET,RequestMethod.POST})
public class PropietarioController {

	@Autowired
	private IPropietarioService propietarioService;

	@GetMapping
	public List<PropietarioMappingResponse> getAllPropietarios() {
		try {
			List<Propietario> propietarios = propietarioService.getAllPropietarios();
			List<PropietarioMappingResponse> response = new ArrayList<PropietarioMappingResponse>();
			for (Propietario pro : propietarios) {
				response.add(new PropietarioMappingResponse(pro));
			}
			return response;
		} catch (Exception e) {
			return null;
		}
	}

	@PostMapping
	public PropietarioMappingResponse addPropietario(@RequestBody PropietarioRequest propietarioRequest) {
		try {
			System.out.println("Entro a addPropietario");
			return new PropietarioMappingResponse(propietarioService.addPropietario(propietarioRequest));
		} catch (Exception e) {
			return null;
		}
	}

	@PutMapping
	public PropietarioMappingResponse updatePropietario(@RequestBody PropietarioRequest propietarioRequest) {
		try {
			return new PropietarioMappingResponse(propietarioService.updatePropietario(propietarioRequest));
		} catch (Exception e) {
			return null;
		}
	}

	@GetMapping("/{id}")
	public PropietarioMappingResponse getPropietarioById(@PathVariable(name = "id") Long id) {
		try {
			return new PropietarioMappingResponse(propietarioService.getPropietario(id));
		} catch (Exception e) {
			return null;
		}
	}

	@DeleteMapping("/{id}")
	public String deletePropietarioById(@PathVariable(name = "id") Long id) {
		try {
			propietarioService.deletePropietario(id);
			return "Ok";
		} catch (Exception e) {
			return "Error: " + e;
		}
	}
}
