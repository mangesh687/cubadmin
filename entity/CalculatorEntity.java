package com.cub.cubadmin.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="calculator")
public class CalculatorEntity {

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="calciname")
	private String calciName;
	
	@Column(name="calciformula")
	private String calciFormula;

	public CalculatorEntity() {
		super();
		
	}

	public CalculatorEntity(int id, String calciName, String calciFormula) {
		super();
		this.id = id;
		this.calciName = calciName;
		this.calciFormula = calciFormula;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCalciName() {
		return calciName;
	}

	public void setCalciName(String calciName) {
		this.calciName = calciName;
	}

	public String getCalciFormula() {
		return calciFormula;
	}

	public void setCalciFormula(String calciFormula) {
		this.calciFormula = calciFormula;
	}
	
	
	
}
