package com.example.demo.DTO;

import java.io.Serializable;

public class ResposeWorksDTO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1342545345L;

	private Integer id;
	
	private String nameWork;
	private String name;
	private String lastName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNameWork() {
		return nameWork;
	}
	public void setNameWork(String nameWork) {
		this.nameWork = nameWork;
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
	@Override
	public String toString() {
		return "ResposeWorksDTO [id=" + id + ", nameWork=" + nameWork + ", name=" + name + ", lastName=" + lastName
				+ "]";
	}
	
	

}
