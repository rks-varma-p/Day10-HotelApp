package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Hotel {

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Id 
	String name;
	String address;
	String city;
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Hotel [name=" + name + ", address=" + address + ", city=" + city + "]";
	}

}
