package com.busqueaqui.viagens.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

@Entity
public class Employee extends Person{
	
	@NotBlank
	private String code;
	
	@NotBlank
	private String currentAccount;
	
	@ManyToOne
	@JoinColumn(name="office_id", nullable=false)
	private Office office;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCurrentAccount() {
		return currentAccount;
	}

	public void setCurrentAccount(String currentAccount) {
		this.currentAccount = currentAccount;
	}

	public Office getOffice() {
		return office;
	}

	public void setOffice(Office office) {
		this.office = office;
	}

	
	
}
