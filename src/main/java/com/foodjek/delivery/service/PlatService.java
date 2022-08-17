package com.foodjek.delivery.service;

	import java.util.ArrayList;  
	import java.util.List;  
	import org.springframework.beans.factory.annotation.Autowired;  
	import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.foodjek.delivery.model.Plat;
import com.foodjek.delivery.repository.PlatRepository;



	//defining the business logic  
	@Service  
	public class PlatService   
	{  
		@Autowired  
		PlatRepository platRepository;  
		//getting all books record by using the method findaAll() of CrudRepository  
		public List<Plat> getAllPlats()   
		{  
			List<Plat> Plats = new ArrayList<Plat>();  
			platRepository.findAll().forEach(r -> Plats.add(r));  
			return Plats;  	
		}  
		

		
		//getting a specific record by using the method findById() of CrudRepository  
		public Plat getPlatById(int id)   
		{  
			return platRepository.findById(id).get();  
		}  
		//saving a specific record by using the method save() of CrudRepository  
		public void saveOrUpdate(Plat Plat)   
		{  
			platRepository.save(Plat);  
		}  
		//deleting a specific record by using the method deleteById() of CrudRepository  
		public void delete(int id)   
		{  
			platRepository.deleteById(id);  
		}  
		//updating a record  
		public void update(Plat Plat, int id)   
		{  
			platRepository.save(Plat); 
		}  
	}  
