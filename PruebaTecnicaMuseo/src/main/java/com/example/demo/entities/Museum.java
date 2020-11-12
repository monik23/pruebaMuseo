package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="Museos")
public class Museum implements Serializable{
	
private static final long serialVersionUID =1323345465773L; 
	
	@Id
	@Column(name = "idSerial")
	private Integer IdSerial;
	
	@Column(name = "nombre")
	private Integer name;
	
	@Column(name = "pais")
	private Integer country;
	
	@Column(name = "ciudad")
	private Integer city;
	
	@Column(name = "direccion")
	private Integer adress;

	public Integer getIdSerial() {
		return IdSerial;
	}

	public void setIdSerial(Integer idSerial) {
		IdSerial = idSerial;
	}

	public Integer getName() {
		return name;
	}

	public void setName(Integer name) {
		this.name = name;
	}

	public Integer getCountry() {
		return country;
	}

	public void setCountry(Integer country) {
		this.country = country;
	}

	public Integer getCity() {
		return city;
	}

	public void setCity(Integer city) {
		this.city = city;
	}

	public Integer getAdress() {
		return adress;
	}

	public void setAdress(Integer adress) {
		this.adress = adress;
	}
	
	

}
