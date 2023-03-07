package hello;

import java.util.Scanner;


public class print_data extends data{
	
	 public void add_data() {
		
		 
		 System.out.print("Enter Mopile ID ");
		 Scanner in = new Scanner(System.in);
	          setID_mopile(in.nextInt());
		 System.out.print("\n");
	     
		 System.out.print("Enter Frist Name ");
		 Scanner in2 = new Scanner(System.in);
	         setFrist_name(in2.nextLine());
	         System.out.print("\n");
	     
		 System.out.print("Enter Last Name ");
		 Scanner in3 = new Scanner(System.in);
	         setSec_name(in3.nextLine());
	         System.out.print("\n");
	     
		 System.out.print("Enter Age ");
		 Scanner in4 = new Scanner(System.in);
		setAge(in4.nextInt());
	        System.out.print("\n");
	     
		 System.out.print("Enter Phone ");
		 Scanner in5 = new Scanner(System.in);
		 setPhone(in5.nextLine());
	         System.out.print("\n");
	     
		 System.out.print("Enter Gender ");
		 Scanner in6 = new Scanner(System.in);
		 setGander(in6.nextLine());
	         System.out.print("\n");
	     
	     System.out.println("ID Coustmor : = " + ID_costmour + "\n");
	     ID_costmour++;
	 
	 }
	 
}
