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

import com.foodjek.delivery.model.Client;
import com.foodjek.delivery.service.ClientService;


	//mark class as Controller  
	@RestController  
	public class ClientController   
	{  
		//autowire the ClientService class  
		@Autowired  
		ClientService ClientService;  
		//creating a get mapping that retrieves all the Clients detail from the database   
		@GetMapping("/client")  
		private List<Client> getAllClients()   
		{  
			return ClientService.getAllClient();  
		}  

		//creating a get mapping that retrieves the detail of a specific book  
		@GetMapping("/Client/{id}")  
		private Client getClient(@PathVariable("id") int id)   
		{  
			return ClientService.getClientById(id);  
		}  
		
		
		//creating a delete mapping that deletes a specified book  
		@DeleteMapping("/Client/{id}")  
		private void deleteClient(@PathVariable("id") int id)   
		{  
			ClientService.delete(id);  
		}  
		
		
		//creating post mapping that post the book detail in the database  
		@PostMapping("/Client")  
		private int saveClient(@RequestBody Client Client)   
		{  
			ClientService.saveOrUpdate(Client);  
			return Client.getId();  
		}  
		
		//creating put mapping that updates the book detail   
		@PutMapping("/Client")  
		private Client update(@RequestBody Client Client)   
		{  
			ClientService.saveOrUpdate(Client);  
			return Client;  
		}  
	}  


