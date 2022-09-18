package com.pizzahutApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pizzahutApp.model.Pizza;
import com.pizzahutApp.repository.PizzaRepository;

@Component
public class PizzaServiceImpl {

	@Autowired
	private PizzaRepository pizaRepo;
	
	public List<Pizza> getPizza() {

		return (List<Pizza>) pizaRepo.findAll();
	}

	public void savePizza(Pizza pizza) {
		System.out.println("save service");
		pizaRepo.save(pizza);
	}

}
