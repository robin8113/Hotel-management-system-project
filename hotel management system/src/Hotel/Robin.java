package Hotel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Robin {
	static String name;
	 static String address;
	 static String contact;
	 static String email;
	 static String idtype;
	 static String id;
	 
	 Robin(String name2, String address2, String contact2, String email2, String idtype2, String id2)
	 {
		 this.name=name2;
		 this.address=address2;
		 this.contact=contact2;
		 this.email=email2;
		 this.idtype=idtype2;
		 this.id=id2;
	 }
	public static void main(String args[])throws IOException
	{
		 String name;
		 String address;
		 String contact;
		 String email;
		 String idtype;
		 String id;
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("sign up");
	System.out.println("Enter the Name");
	name=br.readLine();
	System.out.println("Enter the Address");
	address=br.readLine();
	System.out.println("Enter the Contact Number");
	contact=br.readLine();
	System.out.println("Enter the Mail Id");
	email=br.readLine();
	System.out.println("Enter the ProofId");
	idtype=br.readLine();
	System.out.println("Enter the Proof Number");
	id=br.readLine();
	Robin obj1=new Robin(name,address,contact,email,idtype,id);
	Customer obj=new Customer(name,address,contact,email,idtype,id);
	obj.register();
	Services o=new Services();
	o.serv();
	while(true)
	{
		System.out.println("Do u you want to add more \n Enter Yes/no");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	
	if(s.equals("yes"))
	{
		display();
	}
	else
	{
		System.exit(0);
	}
    }
	}
	
	
	 
    
	private void register(String name2, String address2, String contact2, String email2, String idtype2, String id2) {
		// TODO Auto-generated method stub
		System.out.println("User Details is Registered");
		System.out.println("Name: "+name2+"\n"+
		"address: "+address2+"\n"+"Contact Number:"+contact2+"\n"+"Email: "+email2+"\n"+"ID Type: "+idtype2+"\n"+"ID Number: "+id2);
	}
	
	public static void display() throws IOException
	{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("sign up");
		System.out.println("Enter the Name");
		name=b.readLine();
		System.out.println("Enter the Address");
		address=b.readLine();
		System.out.println("Enter the Contact Number");
		contact=b.readLine();
		System.out.println("Enter the Mail Id");
		email=b.readLine();
		System.out.println("Enter the ProofId");
		idtype=b.readLine();
		System.out.println("Enter the Proof Number");
		id=b.readLine();
		Customer obj=new Customer(name,address,contact,email,idtype,id);
		obj.register();
		
		
		
	}
	
	}
	

