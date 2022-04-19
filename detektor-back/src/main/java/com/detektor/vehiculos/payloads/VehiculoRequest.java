package com.detektor.vehiculos.payloads;

import lombok.Data;

/**
 * @author adrian avendano concha
 * @email adrian.faconcha@gmail.com
 * @since 19/04/2021
 * @version 1
 */

@Data
public class VehiculoRequest {

	private Long vehiculoId;
	private PropietarioRequest propietario;
	private String placa;
	private String marca;
	private String linea;
	private String cilindrada;
	private String color;
	private String chasis;
	private String tipo;
	private String modelo;

	public VehiculoRequest() {
	}

	public VehiculoRequest(Long vehiculoId, PropietarioRequest propietario, String placa, String marca, String linea,
			String cilindrada, String color, String chasis, String tipo, String modelo) {
		super();
		this.vehiculoId = vehiculoId;
		this.propietario = propietario;
		this.placa = placa;
		this.marca = marca;
		this.linea = linea;
		this.cilindrada = cilindrada;
		this.color = color;
		this.chasis = chasis;
		this.tipo = tipo;
		this.modelo = modelo;
	}

	public Long getVehiculoId() {
		return vehiculoId;
	}

	public void setVehiculoId(Long vehiculoId) {
		this.vehiculoId = vehiculoId;
	}

	public PropietarioRequest getPropietario() {
		return propietario;
	}

	public void setPropietario(PropietarioRequest propietario) {
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
