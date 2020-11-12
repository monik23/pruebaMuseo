package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="Artistas")
public class Artist  implements Serializable{
	
	private static final long serialVersionUID =1323345465774L; 
	
	@Id
	@Column(name = "idSerial")
	private Integer IdSerial;
	
	@Column(name = "tipoId")
	private Integer typeId;
	
	@Column(name = "numeroid")
	private Integer numberId;
	
	@Column(name = "nombre")
	private String name;
	
	@Column(name = "apellido")
	private String lastName;

	public Integer getIdSerial() {
		return IdSerial;
	}

	public void setIdSerial(Integer idSerial) {
		IdSerial = idSerial;
	}

	public Integer getTypeId() {
		return typeId;
	}

	public void setTypeId(Integer typeId) {
		this.typeId = typeId;
	}

	public Integer getNumberId() {
		return numberId;
	}

	public void setNumberId(Integer numberId) {
		this.numberId = numberId;
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
