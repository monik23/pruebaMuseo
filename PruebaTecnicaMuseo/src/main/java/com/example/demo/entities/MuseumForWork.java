package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name ="MuseosXObra")
public class MuseumForWork implements Serializable{
	
private static final long serialVersionUID =1323345465778L; 
	
	@Id
	@Column(name = "idMuseo")
	private Integer idMuseum;
	
	@Id
	@Column(name = "idObra")
	private Integer idWork;

	public Integer getIdMuseum() {
		return idMuseum;
	}

	public void setIdMuseum(Integer idMuseum) {
		this.idMuseum = idMuseum;
	}

	public Integer getIdWork() {
		return idWork;
	}

	public void setIdWork(Integer idWork) {
		this.idWork = idWork;
	}
	
	


}
