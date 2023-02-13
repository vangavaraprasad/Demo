package com.Validations.spring.product;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

@Entity
public class product {
	
	@Id
	@GeneratedValue
	private Integer id;
	@NotBlank
	@Length(min=5 , max=10)
	private String name;
	private String colour;
	@NotNull
	@Min(500)
	@Max(5000)
	private Double Price;
	
	@Pattern(regexp = "^[A-Z]{5}[1-9]{4}[A-Z]$")
 	private String pan;
	
	
	
	public String getPan() {
		return pan;
	}


	public void setPan(String pan) {
		this.pan = pan;
	}


	@Override
	public String toString() {
		return "product [id=" + id + ", name=" + name + ", colour=" + colour + ", Price=" + Price + "]";
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}

}
