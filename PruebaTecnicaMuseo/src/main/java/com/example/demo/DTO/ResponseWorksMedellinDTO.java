package com.example.demo.DTO;

import java.io.Serializable;

public class ResponseWorksMedellinDTO  implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1232523545L;

	private Integer typeId;
	
	private Integer numberId;
	
	private String name;
	
	private String lastName;

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

	@Override
	public String toString() {
		return "ResponseWorksMedellinDTO [typeId=" + typeId + ", numberId=" + numberId + ", name=" + name
				+ ", lastName=" + lastName + "]";
	}
	
	

}
