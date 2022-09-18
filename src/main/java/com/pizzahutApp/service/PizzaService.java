package com.pizzahutApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pizzahutApp.model.Pizza;

@Service
public interface PizzaService {
	
	public List<Pizza> getPizza();
	
	public void savePizza(Pizza pizza);

}
