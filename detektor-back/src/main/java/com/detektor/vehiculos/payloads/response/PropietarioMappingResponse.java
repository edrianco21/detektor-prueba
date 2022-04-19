package com.detektor.vehiculos.payloads.response;

import com.detektor.vehiculos.models.Propietario;

/**
 * @author adrian avendano concha
 * @email adrian.faconcha@gmail.com
 * @since 19/04/2021
 * @version 1
 */

public class PropietarioMappingResponse {

	private Long propietarioId;
	private String email;
	private String phone;
	private String address;
	private String document;
	private String name;
	private String lastName;

	public PropietarioMappingResponse() {

	}

	public PropietarioMappingResponse(Propietario propietario) {
		this.propietarioId = propietario.getPropietarioId();
		this.email = propietario.getEmail();
		this.phone = propietario.getPhone();
		this.address = propietario.getAddress();
		this.document = propietario.getDocument();
		this.name = propietario.getName();
		this.lastName = propietario.getLastName();
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

}
