package com.foodjek.delivery.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;  
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table  
public class Plat 
{  
	//Defining book id as primary key  
	@Id
	
	@Column  
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	
	@Column(name = "name", length = 50)  
	private String name; 
	
	@Column(name = "photo", length = 150)   
	private String photo;  
	
	@Column(name="prix")
	private double prix;  
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "id_res", referencedColumnName = "id")
	private Restaurant restaurant;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	

}