package com.foodjek.delivery.model;


	import javax.persistence.Column;  
	import javax.persistence.Entity;
    import javax.persistence.GeneratedValue;
    import javax.persistence.GenerationType;
    import javax.persistence.Id;  
	import javax.persistence.Table;  
	//mark class as an Entity   
	@Entity  
	//defining class name as Table name  
	@Table  
	public class Client  
	{  
		//Defining book id as primary key  
		@Id  
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column  
		private int id;  
		
		@Column  
		private String name;  
		
		@Column  
		private String email;  	
		
		@Column  
		private String phone; 
		
		@Column  
		private String longitude; 		
		
		@Column  
		private String lattitude;

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

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getLongitude() {
			return longitude;
		}

		public void setLongitude(String longitude) {
			this.longitude = longitude;
		}

		public String getLattitude() {
			return lattitude;
		}

		public void setLattitude(String lattitude) {
			this.lattitude = lattitude;
		}

		@Override
		public String toString() {
			return "Livreur [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", longitude="
					+ longitude + ", lattitude=" + lattitude + "]";
		} 		

		
		
		
}

