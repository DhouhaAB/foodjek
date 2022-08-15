package com.foodjek.delivery.service;




	import java.util.ArrayList;  
	import java.util.List;  
	import org.springframework.beans.factory.annotation.Autowired;  
	import org.springframework.stereotype.Service;

import com.foodjek.delivery.model.Client;
import com.foodjek.delivery.repository.ClientRepository;





	//defining the business logic  
	@Service  
	public class ClientService   
	{  
		@Autowired  
		ClientRepository clientRepository;  
		//getting all books record by using the method findaAll() of CrudRepository  
		public List<Client> getAllClient()   
		{  
			List<Client> clients = new ArrayList<Client>();  
			clientRepository.findAll().forEach(r -> clients.add(r));  
			return clients;  	
		}  
		//getting a specific record by using the method findById() of CrudRepository  
		public Client getClientById(int id)   
		{  
			return clientRepository.findById(id).get();  
		}  
		//saving a specific record by using the method save() of CrudRepository  
		public void saveOrUpdate(Client Client)   
		{  
			clientRepository.save(Client);  
		}  
		//deleting a specific record by using the method deleteById() of CrudRepository  
		public void delete(int id)   
		{  
			clientRepository.deleteById(id);  
		}  

	}  


