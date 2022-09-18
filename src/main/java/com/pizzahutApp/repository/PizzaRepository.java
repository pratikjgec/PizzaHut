package com.pizzahutApp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pizzahutApp.model.Pizza;

@Repository
public interface PizzaRepository extends CrudRepository<Pizza,Long>{
	
	

}
