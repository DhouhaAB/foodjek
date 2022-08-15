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

import com.foodjek.delivery.model.Livreur;
import com.foodjek.delivery.service.LivreurService;


	//mark class as Controller  
	@RestController  
	public class LivreurController   
	{  
		//autowire the LivreurService class  
		@Autowired  
		LivreurService LivreurService;  
		//creating a get mapping that retrieves all the Livreurs detail from the database   
		@GetMapping("/livreur")  
		private List<Livreur> getAllLivreurs()   
		{  
			return LivreurService.getAllLivreurs();  
		}  

		//creating a get mapping that retrieves the detail of a specific book  
		@GetMapping("/livreur/{id}")  
		private Livreur getLivreur(@PathVariable("id") int id)   
		{  
			return LivreurService.getLivreurById(id);  
		}  
		
		
		//creating a delete mapping that deletes a specified book  
		@DeleteMapping("/livreur/{id}")  
		private void deleteLivreur(@PathVariable("id") int id)   
		{  
			LivreurService.delete(id);  
		}  
		
		
		//creating post mapping that post the book detail in the database  
		@PostMapping("/livreur")  
		private int saveLivreur(@RequestBody Livreur Livreur)   
		{  
			LivreurService.saveOrUpdate(Livreur);  
			return Livreur.getId();  
		}  
		
		//creating put mapping that updates the book detail   
		@PutMapping("/livreur")  
		private Livreur update(@RequestBody Livreur Livreur)   
		{  
			LivreurService.saveOrUpdate(Livreur);  
			return Livreur;  
		}  
	}  


