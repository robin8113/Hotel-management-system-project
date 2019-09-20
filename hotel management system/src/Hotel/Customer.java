package Hotel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Customer {
	
	 String name;
	 String address;
	 String contact;
	 String email;
	 String idtype;
     String id;
     static int count=1;
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



	public String getContact() {
		return contact;
	}



	public void setContact(String contact) {
		this.contact = contact;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getIdtype() {
		return idtype;
	}



	public void setIdtype(String idtype) {
		this.idtype = idtype;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}

Customer()
{
	
}

	
	 Customer(String name2, String address2, String contact2, String email2, String idtype2, String id2)
	 {
		 setName(name2);
		 setAddress(address2);
		 setContact(contact2);
		 setEmail(email2);
		 setIdtype(idtype2);
		 setId(id2);
	 }
	
	

	public void register() {
		
		System.out.println("User Details is Registered");
		System.out.println("Name: "+getName()+"\n"+"address: "+getAddress()+"\n"+"Contact Number:"+getContact()+"\n"+"Email: "+getEmail()+"\n"+"ID Type: "+getIdtype()+"\n"+"ID Number: "+getId());
		System.out.println("Employee Id:"+count++);
		
		
		
	}
}

