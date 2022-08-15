package com.foodjek.delivery.repository;




import org.springframework.data.repository.CrudRepository;

import com.foodjek.delivery.model.Livreur;



//repository that extends CrudRepository  
public interface LivreurRepository extends CrudRepository<Livreur, Integer>  
{  
	
}  
