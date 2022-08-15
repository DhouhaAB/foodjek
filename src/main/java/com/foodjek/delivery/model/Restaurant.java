package com.foodjek.delivery.model;
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;  
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table  
public class Restaurant  
{  
	//Defining book id as primary key  
	@Id  
	@Column  
	private int id;  
	@Column  
	private String name;  
	@Column  
	private String adress;  
	@Column  
	private String phone;  
	@Column  
	private String email; 
	@Column  
	private String contact;
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
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", adress=" + adress + ", phone=" + phone + ", email=" + email
				+ ", contact=" + contact + "]";
	} 


}