package com.detektor.vehiculos.payloads;

import lombok.Data;

/**
 * @author adrian avendano concha
 * @email adrian.faconcha@gmail.com
 * @since 19/04/2021
 * @version 1
 */

@Data
public class PropietarioRequest {

	private Long propietarioId;
	private String email;
	private String phone;
	private String address;
	private String document;
	private String name;
	private String lastName;

	public PropietarioRequest() {
	}

	public PropietarioRequest(Long propietarioId, String email, String phone, String address, String document,
			String name, String lastName) {
		super();
		this.propietarioId = propietarioId;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.document = document;
		this.name = name;
		this.lastName = lastName;
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
