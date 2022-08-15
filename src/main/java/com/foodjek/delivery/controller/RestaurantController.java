package com.foodjek.delivery.controller;

	import java.util.List;  
	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;  
	import org.springframework.web.bind.annotation.GetMapping;  
	import org.springframework.web.bind.annotation.PathVariable;  
	import org.springframework.web.bind.annotation.PostMapping;  
	import org.springframework.web.bind.annotation.PutMapping;  
	import org.springframework.web.bind.annotation.RequestBody;  
	import org.springframework.web.bind.annotation.RestController;

import com.foodjek.delivery.model.Restaurant;
import com.foodjek.delivery.service.RestaurantService;


	//mark class as Controller  
	@RestController  
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public class RestaurantController   
	{  
		//autowire the restaurantService class  
		@Autowired  
		RestaurantService restaurantService;  
		//creating a get mapping that retrieves all the Restaurants detail from the database   
		@GetMapping("/restaurant")  
		private List<Restaurant> getAllRestaurants()   
		{  
			return restaurantService.getAllRestaurants();  
		}  

		//creating a get mapping that retrieves the detail of a specific book  
		@GetMapping("/restaurant/{id}")  
		private Restaurant getRestaurant(@PathVariable("id") int id)   
		{  
			return restaurantService.getRestaurantById(id);  
		}  
		
		
		//creating a delete mapping that deletes a specified book  
		@DeleteMapping("/restaurant/{id}")  
		private void deleteRestaurant(@PathVariable("id") int id)   
		{  
			restaurantService.delete(id);  
		}  
		
		
		//creating post mapping that post the book detail in the database  
		@PostMapping("/restaurant")  
		private int saveRestaurant(@RequestBody Restaurant restaurant)   
		{  
			restaurantService.saveOrUpdate(restaurant);  
			return restaurant.getId();  
		}  
		
		//creating put mapping that updates the book detail   
		@PutMapping("/restaurant")  
		private Restaurant update(@RequestBody Restaurant restaurant)   
		{  
			restaurantService.saveOrUpdate(restaurant);  
			return restaurant;  
		}  
	}  

