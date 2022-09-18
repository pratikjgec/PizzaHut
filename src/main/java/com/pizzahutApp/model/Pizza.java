package com.pizzahutApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pizza {
	
	@Id
	@GeneratedValue
	private Long pizzaId;
	private String name;
	@Column(nullable = false)
	private String type;
	private String price;
	public Long getPizzaId() {
		return pizzaId;
	}
	public void setPizzaId(Long pizzaId) {
		this.pizzaId = pizzaId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Pizza [pizzaId=" + pizzaId + ", name=" + name + ", type=" + type + ", price=" + price + "]";
	}

	
	
}
