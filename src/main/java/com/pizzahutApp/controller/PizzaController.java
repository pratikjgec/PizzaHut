package com.pizzahutApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pizzahutApp.model.Pizza;
import com.pizzahutApp.service.PizzaServiceImpl;

@RestController
public class PizzaController {
	
	@Autowired
	private PizzaServiceImpl pizzaService;
	
	@GetMapping("/getAll")
	public List<Pizza> getAllPizza()
	{
		return pizzaService.getPizza();
	}
	@PostMapping("/save")
	public String savePizza(@RequestBody Pizza pizza)
	{
		System.out.println("inside save");
		pizzaService.savePizza(pizza);
		System.out.println("after save");
		
		return "Pizza Saved sucessfully";
		
	}
	

}
