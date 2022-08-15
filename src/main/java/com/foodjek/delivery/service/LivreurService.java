package com.foodjek.delivery.service;




	import java.util.ArrayList;  
	import java.util.List;  
	import org.springframework.beans.factory.annotation.Autowired;  
	import org.springframework.stereotype.Service;

import com.foodjek.delivery.model.Livreur;
import com.foodjek.delivery.repository.LivreurRepository;



	//defining the business logic  
	@Service  
	public class LivreurService   
	{  
		@Autowired  
		LivreurRepository livreurRepository;  
		//getting all books record by using the method findaAll() of CrudRepository  
		public List<Livreur> getAllLivreurs()   
		{  
			List<Livreur> livreurs = new ArrayList<Livreur>();  
			livreurRepository.findAll().forEach(r -> livreurs.add(r));  
			return livreurs;  	
		}  
		//getting a specific record by using the method findById() of CrudRepository  
		public Livreur getLivreurById(int id)   
		{  
			return livreurRepository.findById(id).get();  
		}  
		//saving a specific record by using the method save() of CrudRepository  
		public void saveOrUpdate(Livreur Livreur)   
		{  
			livreurRepository.save(Livreur);  
		}  
		//deleting a specific record by using the method deleteById() of CrudRepository  
		public void delete(int id)   
		{  
			livreurRepository.deleteById(id);  
		}  

	}  

