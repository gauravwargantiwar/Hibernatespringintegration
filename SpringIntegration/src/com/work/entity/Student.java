package com.work.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {

	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="Name")
	private String Name;
	
	@Column(name="FirstName")
	private String FirstName;
	
	@Column(name="Address")
	private String Address;
	
	@Column(name="City")
	private String City;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", FirstName=" + FirstName + ", Address=" + Address + ", City="
				+ City + "]";
	}
	
	
	
	
	
}
