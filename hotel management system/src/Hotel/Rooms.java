package Hotel;

import java.util.Scanner;

public class Rooms {
 
	  String name;
	  String address;
	  String contact;
	  String email;
	  String idtype;
	  String id;
	  int book[];
	  Customer ob=new Customer();
	  void checkstatus(int roomid[])
	  {
		  int flag=0;
		  Scanner sc= new Scanner(System.in);
		  System.out.println("Enter the Room number");
		  int p=sc.nextInt();
		  for(int i=0;i<roomid.length;i++)
		  {
			 
		  if(roomid[i]==ob.count&&(i+1)==p)
		  {
			  flag=1;
			  System.out.println("the Room number "+(i+1)+" is booked");
		  }
		  }
		  if(flag==0)
		  {
			  System.out.println(" Room is not booked ");
		  }
	  }
}
