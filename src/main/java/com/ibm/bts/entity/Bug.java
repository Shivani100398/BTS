package com.ibm.bts.entity;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Bug {
    
	private String id;
    @NotNull
    @NotBlank
	private String status;
    @NotNull
	private String description;
    private Date date;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		if(status.equals("Fixed")||status.equals("Open")||status.equals("NeedMoreInfo")||status.equals("Retest"))
		{this.status = status;}
		else
		{throw new IllegalArgumentException();}
		
	}



	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
