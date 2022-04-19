package com.detektor.vehiculos.models;

import java.util.List;

import javax.persistence.*;

import com.detektor.vehiculos.payloads.PropietarioRequest;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author adrian avendano concha
 * @email adrian.faconcha@gmail.com
 * @since 19/04/2021
 * @version 1
 */

@Entity
@Table(name = "propietarios")
public class Propietario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "propietario_id", nullable = false)
	private Long propietarioId;

	@OneToMany(mappedBy = "propietario")
	@JsonIgnore
	private List<Vehiculo> items;

	@Column(name = "email", nullable = false)
	private String email;

	@Column(name = "phone", nullable = false)
	private String phone;

	@Column(name = "address", nullable = false)
	private String address;

	@Column(name = "document", nullable = false)
	private String document;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "last_name", nullable = false)
	private String lastName;

	public Propietario() {
	}

	public Propietario(Long propietarioId, List<Vehiculo> items, String email, String phone, String address,
			String document, String name, String lastName) {
		super();
		this.propietarioId = propietarioId;
		this.items = items;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.document = document;
		this.name = name;
		this.lastName = lastName;
	}

	public Propietario(PropietarioRequest propietarioRequest) {
		this.propietarioId = propietarioRequest.getPropietarioId();
		this.email = propietarioRequest.getEmail();
		this.phone = propietarioRequest.getPhone();
		this.address = propietarioRequest.getAddress();
		this.document = propietarioRequest.getDocument();
		this.name = propietarioRequest.getName();
		this.lastName = propietarioRequest.getLastName();
	}
	
	public Long getPropietarioId() {
		return propietarioId;
	}

	public void setPropietarioId(Long propietarioId) {
		this.propietarioId = propietarioId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDocument() {
		return document;
	}

	public void setDocument(String document) {
		this.document = document;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Vehiculo> getItems() {
		return items;
	}

	public void setItems(List<Vehiculo> items) {
		this.items = items;
	}

}
