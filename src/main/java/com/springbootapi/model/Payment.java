package com.springbootapi.model;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="Payment")
@EntityListeners(AuditingEntityListener.class)


public class Payment {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	
	private long Id;
	
	@NotBlank
	private  String ProductId;
	@NotBlank
	private String Description;
	@NotBlank 
	private double Amount;
	
	
	
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	
	public String getProductId() {
		return ProductId;
	}
	public void setProductId(String productId) {
		ProductId = productId;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	

}
