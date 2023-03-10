package com.busqueaqui.viagens.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;

@Entity
public class Airline {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@NotBlank
	private String name;
	
	@OneToMany(mappedBy="airline")
	private List<Office> office;

	@OneToMany(mappedBy="airline")
	private List<Route> route;
	
	@OneToMany(mappedBy="airline")
	private List<Airplane> airplane;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Office> getOffice() {
		return office;
	}

	public void setOffice(List<Office> office) {
		this.office = office;
	}

	public List<Route> getRoute() {
		return route;
	}

	public void setRoute(List<Route> route) {
		this.route = route;
	}

	public List<Airplane> getAirplane() {
		return airplane;
	}

	public void setAirplane(List<Airplane> airplane) {
		this.airplane = airplane;
	}

	
	
}
