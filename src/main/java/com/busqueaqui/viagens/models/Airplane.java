package com.busqueaqui.viagens.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;

@Entity
public class Airplane {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@NotBlank
	private String code;
	
	@NotBlank
	private Double load;
	
	@NotBlank
	private Integer economicQty;
	
	@NotBlank
	private Integer firstQty;
	
	@NotBlank
	private Integer executiveQty;
	
	@ManyToOne
	@JoinColumn(name="airline_id", nullable=false)
	private Airline airline;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Double getLoad() {
		return load;
	}

	public void setLoad(Double load) {
		this.load = load;
	}

	public Integer getEconomicQty() {
		return economicQty;
	}

	public void setEconomicQty(Integer economicQty) {
		this.economicQty = economicQty;
	}

	public Integer getFirstQty() {
		return firstQty;
	}

	public void setFirstQty(Integer firstQty) {
		this.firstQty = firstQty;
	}

	public Integer getExecutiveQty() {
		return executiveQty;
	}

	public void setExecutiveQty(Integer executiveQty) {
		this.executiveQty = executiveQty;
	}

	public Airline getAirline() {
		return airline;
	}

	public void setAirline(Airline airline) {
		this.airline = airline;
	}
	
	
}
