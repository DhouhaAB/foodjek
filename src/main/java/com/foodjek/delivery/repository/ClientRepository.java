package com.foodjek.delivery.repository;




import org.springframework.data.repository.CrudRepository;

import com.foodjek.delivery.model.Client;





//repository that extends CrudRepository  
public interface ClientRepository extends CrudRepository<Client, Integer>  
{  
	
}  
