package com.detektor.vehiculos.models;

import javax.persistence.*;

import com.detektor.vehiculos.payloads.VehiculoRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author adrian avendano concha
 * @email adrian.faconcha@gmail.com
 * @since 19/04/2021
 * @version 1
 */

@Entity
@Table(name = "vehiculos")
public class Vehiculo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vehiculo_id", nullable = false)
	private Long vehiculoId;

	@ManyToOne
	@JsonIgnore
	@JoinColumn(name = "propietario", referencedColumnName = "propietario_id" , nullable = false)
	private Propietario propietario;

	@Column(name = "placa", nullable = false)
	private String placa;

	@Column(name = "marca", nullable = false)
	private String marca;

	@Column(name = "linea", nullable = false)
	private String linea;

	@Column(name = "cilindrada", nullable = false)
	private String cilindrada;

	@Column(name = "color", nullable = false)
	private String color;

	@Column(name = "chasis", nullable = false)
	private String chasis;

	@Column(name = "tipo", nullable = false)
	private String tipo;

	@Column(name = "modelo", nullable = false)
	private String modelo;

	public Vehiculo() {
	}

	public Vehiculo(Long vehiculoId, Propietario propietario, String placa, String marca, String linea,
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
	
	public Vehiculo(VehiculoRequest vehiculoRequest) {
		this.vehiculoId = vehiculoRequest.getVehiculoId();
		this.propietario = new Propietario(vehiculoRequest.getPropietario());
		this.placa = vehiculoRequest.getPlaca();
		this.marca = vehiculoRequest.getMarca();
		this.linea = vehiculoRequest.getLinea();
		this.cilindrada = vehiculoRequest.getCilindrada();
		this.color = vehiculoRequest.getColor();
		this.chasis = vehiculoRequest.getChasis();
		this.tipo = vehiculoRequest.getTipo();
		this.modelo = vehiculoRequest.getModelo();
	}

	public Long getVehiculoId() {
		return vehiculoId;
	}

	public void setVehiculoId(Long vehiculoId) {
		this.vehiculoId = vehiculoId;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
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
