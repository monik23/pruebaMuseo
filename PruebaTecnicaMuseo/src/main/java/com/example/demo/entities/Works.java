package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="Obras")
public class Works implements Serializable{
	
private static final long serialVersionUID =1323345465772L; 
	
	@Id
	@Column(name = "idSerial")
	private Integer IdSerial;
	
	@Column(name = "nombre")
	private Integer name;
	
	@Column(name = "pais")
	private Integer country;
	
	@Column(name = "idartista")
	private Integer IdArtist;

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

	public Integer getIdArtist() {
		return IdArtist;
	}

	public void setIdArtist(Integer idArtist) {
		IdArtist = idArtist;
	}
	
	
	

}
