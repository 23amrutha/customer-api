package com.acc.training.customerapi.domain;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customer") 	
public class Customer {
	
	@Id
	private int id;
	private String name;
	private String address;
	private int officecode;
	
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getOfficecode() {
		return officecode;
	}
	public void setOfficecode(int officecode) {
		this.officecode = officecode;
	}

	
	@Override
	  public boolean equals(java.lang.Object o) {
	    if (this == o) {
	      return true;
	    }
	    if (o == null || getClass() != o.getClass()) {
	      return false;
	    }
	    Customer customer = (Customer) o;
	    return Objects.equals(this.id, customer.id) &&
	        Objects.equals(this.name, customer.name) &&
	        Objects.equals(this.address, customer.address) &&
	        Objects.equals(this.officecode, customer.officecode);
	  }

 

      @Override
      public int hashCode() {
    	  return Objects.hash(id, name, address, officecode);
  }

}


