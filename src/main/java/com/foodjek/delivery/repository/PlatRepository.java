package com.foodjek.delivery.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.foodjek.delivery.model.Plat;



//repository that extends CrudRepository  
@SuppressWarnings("unused")
public interface PlatRepository extends CrudRepository<Plat, Integer>  
{  

}  