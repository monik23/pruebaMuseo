package com.example.demo.entities;

import java.io.Serializable;

public class MuseumForWorkPK implements Serializable{
	
	private static final long serialVersionUID =1323345465771L; 
	
	private Integer idMuseum;
	private Integer idWork;
	
	public MuseumForWorkPK(Integer idMuseum, Integer idWork) {
		super();
		this.idMuseum = idMuseum;
		this.idWork = idWork;
	}
	
	

	public MuseumForWorkPK() {
		super();
	}



	@Override
	public String toString() {
		return "MuseumForWorkPK [idMuseum=" + idMuseum + ", idWork=" + idWork + "]";
	}



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
