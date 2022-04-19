package com.detektor.vehiculos.payloads.response;

import com.detektor.vehiculos.models.Vehiculo;

/**
 * @author adrian avendano concha
 * @email adrian.faconcha@gmail.com
 * @since 19/04/2021
 * @version 1
 */

public class VehiculoMappingResponse {

	private Long vehiculoId;
	private PropietarioMappingResponse propietario;
	private String placa;
	private String marca;
	private String linea;
	private String cilindrada;
	private String color;
	private String chasis;
	private String tipo;
	private String modelo;

	public VehiculoMappingResponse() {

	}

	public VehiculoMappingResponse(Vehiculo vehiculo) {
		super();
		this.vehiculoId = vehiculo.getVehiculoId();
		this.propietario = new PropietarioMappingResponse(vehiculo.getPropietario());
		this.placa = vehiculo.getPlaca();
		this.marca = vehiculo.getMarca();
		this.linea = vehiculo.getLinea();
		this.cilindrada = vehiculo.getCilindrada();
		this.color = vehiculo.getColor();
		this.chasis = vehiculo.getChasis();
		this.tipo = vehiculo.getTipo();
		this.modelo = vehiculo.getModelo();
	}

	public Long getVehiculoId() {
		return vehiculoId;
	}

	public void setVehiculoId(Long vehiculoId) {
		this.vehiculoId = vehiculoId;
	}

	public PropietarioMappingResponse getPropietario() {
		return propietario;
	}

	public void setPropietario(PropietarioMappingResponse propietario) {
		this.propietario = propietario;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getLinea() {
		return linea;
	}

	public void setLinea(String linea) {
		this.linea = linea;
	}

	public String getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(String cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getChasis() {
		return chasis;
	}

	public void setChasis(String chasis) {
		this.chasis = chasis;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
