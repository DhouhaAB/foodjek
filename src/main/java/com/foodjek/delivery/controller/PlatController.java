package com.foodjek.delivery.controller;

	import java.util.List;  
	import org.springframework.beans.factory.annotation.Autowired;  
	import org.springframework.web.bind.annotation.DeleteMapping;  
	import org.springframework.web.bind.annotation.GetMapping;  
	import org.springframework.web.bind.annotation.PathVariable;  
	import org.springframework.web.bind.annotation.PostMapping;  
	import org.springframework.web.bind.annotation.PutMapping;  
	import org.springframework.web.bind.annotation.RequestBody;  
	import org.springframework.web.bind.annotation.RestController;

import com.foodjek.delivery.model.Plat;
import com.foodjek.delivery.service.PlatService;


	//mark class as Controller  
	@RestController  
	public class PlatController   
	{  
		//autowire the PlatService class  
		@Autowired  
		PlatService platService;  
		//creating a get mapping that retrieves all the Plats detail from the database   
		@GetMapping("/plat")  
		private List<Plat> getAllPlats()   
		{  
			return platService.getAllPlats();  
		}  
		


		//creating a get mapping that retrieves the detail of a specific book  
		@GetMapping("/plat/{id}")  
		private Plat getPlat(@PathVariable("id") int id)   
		{  
			return platService.getPlatById(id);  
		}  
		
		
		//creating a delete mapping that deletes a specified book  
		@DeleteMapping("/plat/{id}")  
		private void deletePlat(@PathVariable("id") int id)   
		{  
			platService.delete(id);  
		}  
		
		
		//creating post mapping that post the book detail in the database  
		@PostMapping("/plat")  
		private int savePlat(@RequestBody Plat Plat)   
		{  
			platService.saveOrUpdate(Plat);  
			return Plat.getId();  
		}  
		
		//creating put mapping that updates the book detail   
		@PutMapping("/plat")  
		private Plat update(@RequestBody Plat Plat)   
		{  
			platService.saveOrUpdate(Plat);  
			return Plat;  
		}  
	}  

