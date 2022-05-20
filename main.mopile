package hello; 

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
@SuppressWarnings({ "unused", "serial" })
public class hello_java extends ArrayList<Object>{

	static void print_choose() {
		System.out.println("\t1 : choose mopile ");
		System.out.println("\t2 : system ");
		System.out.println("\t0 : Exit ");
		System.out.println("");
	}
	
	static void print_choose_mopile() {
		System.out.println("\t1) Samsung ");
		System.out.println("\t2) Oppo    ");
		System.out.println("\t3) Apple   ");
		System.out.println("\t4) Huawei  ");
		System.out.println("\t5) Nokia   ");
		System.out.println("\t6) Infinix ");
		System.out.println("\t7) Xiaomi  ");
		System.out.println("\t8) Show All and Exit");
		System.out.println("");
        
	}
	
	static void print_system() {
		System.out.println("\t1 : View Statistics ");
		System.out.println("\t2 : Search_Customer_ID ");
		System.out.println("\t0 : Exit ");
		System.out.println("");
	}
	
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j = 0, r = 0;
		String sign = "admin";
	    
		print_shape sh = new print_shape();
        Samsung s = new Samsung(); 
        Oppo p = new Oppo(); 
        Apple A = new Apple(); 
        Huawei H = new Huawei();
        Nokia N = new Nokia();
        Infinix I = new Infinix();
        Xiaomi X = new Xiaomi();
        print_data[] pd = new print_data[1000];
        data d = new data();
        sh.display();
        
        
        
        char choose;
        
			do {
	        print_choose();
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        if (n == 1) {
	        	
	        	print_choose_mopile();
	        	System.out.println("Enter the id : ");
	            Scanner id = new Scanner(System.in);
	            int num = id.nextInt();
			    char ca;
	            switch(num) {
			    case 1:
			    	s.set_data();
			           System.out.println("\t\tEnter 'B' to buy it OR 'R' to choose another one\n"); 
			           System.out.println("\t\t       OR Any key to return to main page:\n");
			           Scanner c = new Scanner(System.in);
			            ca = c.next().charAt(0);
			            if     (ca == 'R' || ca == 'r')          {break;}
			            else if(ca == 'B' || ca == 'b') {
			            	for (int i = r; i < r + 1; i++) {
			            		pd[i] = new print_data();
			            		pd[i].add_data();
			            	}r++;
			            	j++;
			            }
			            else                                      break;
			    case 2:
			    	p.set_data();
			           System.out.println("\t\tEnter 'B' to buy it OR 'R' to choose another one\n"); 
			           System.out.println("\t\t       OR Any key to return to main page:\n");
			           Scanner c1 = new Scanner(System.in);
			           ca = c1.next().charAt(0);
			            if     (ca == 'R' || ca == 'r')          break;
			            else if(ca == 'B' || ca == 'b') {          
			            	for (int i = r; i < r + 1; i++) {
			            		pd[i] = new print_data();
			            		pd[i].add_data();
			            		
			            	}r++;
			            	j++;	
			            }
			            else                                      break;
			            break;
			    case 3:
			    	A.set_data();
			           System.out.println("\t\tEnter 'B' to buy it OR 'R' to choose another one\n"); 
			           System.out.println("\t\t       OR Any key to return to main page:\n");
			           Scanner c2 = new Scanner(System.in);
			           char ca1 = c2.next().charAt(0);
			            if     (ca1 == 'R' || ca1 == 'r')          break;
			            else if(ca1 == 'B' || ca1 == 'b') {                                            
			            	for (int i = r; i < r + 1; i++) {
			            		pd[i] = new print_data();
			            		pd[i].add_data();
			            	}r++; j++;
			            	
			            }
			            else                                      break;
			            break;
			    case 4:
			    	H.set_data();
			           System.out.println("\t\tEnter 'B' to buy it OR 'R' to choose another one\n"); 
			           System.out.println("\t\t       OR Any key to return to main page:\n");
			           Scanner c3 = new Scanner(System.in);
			           char ca2 = c3.next().charAt(0);
			            if     (ca2 == 'R' || ca2 == 'r')          break;
			            else if(ca2 == 'B' || ca2 == 'b') {
			            	for (int i = r; i < r + 1; i++) {
			            		pd[i] = new print_data(); 
			            		pd[i].add_data();
			            	}r++;  j++;
			            }
			            else                                      break;
			            break;
			    case 5:
			    	N.set_data();
			           System.out.println("\t\tEnter 'B' to buy it OR 'R' to choose another one\n"); 
			           System.out.println("\t\t       OR Any key to return to main page:\n");
			           Scanner c4 = new Scanner(System.in);
			           char ca3 = c4.next().charAt(0);
			            if     (ca3 == 'R' || ca3 == 'r')          break; 
			            else if(ca3 == 'B' || ca3 == 'b') {          
			            	for (int i = r; i < r + 1; i++) {
			            		pd[i] = new print_data();
			            		pd[i].add_data();
			            	}r++;
			            	j++;
			            }
			            else                                    break;
			            break;
			    case 6:
			    	I.set_data();
			           System.out.println("\t\tEnter 'B' to buy it OR 'R' to choose another one\n"); 
			           System.out.println("\t\t       OR Any key to return to main page:\n");
			           Scanner c5 = new Scanner(System.in);
			           char ca4 = c5.next().charAt(0);
			            if     (ca4 == 'R' || ca4 == 'r')           break;
			            else if(ca4 == 'B' || ca4 == 'b') {          
			            	for (int i = 1; i < r + 1; i++) {
			            		pd[i] = new print_data();
			            		pd[i].add_data();
			            	}r++;
			            	j++;
			            }
			            else                                      break;
			            break;
			    case 7:
			    	X.set_data();
			           System.out.println("\t\tEnter 'B' to buy it OR 'R' to choose another one\n"); 
			           System.out.println("\t\t       OR Any key to return to main page:\n");
			           Scanner c6 = new Scanner(System.in);
			           char ca5 = c6.next().charAt(0);
			            if     (ca5 == 'R' || ca5 == 'r')          break; 
			            else if(ca5 == 'B' || ca5 == 'b') {
			            	for (int i = r; i < r + 1; i++) {
					        	pd[i].display_data();
				                System.out.print("\n");
			            	}r++;
			            	j++;
			            }
			            else                                      break;
			            break;
			    case 8:
			    	 s.set_data(); p.set_data(); 
		        	 A.set_data(); H.set_data();
		        	 N.set_data(); I.set_data();
		        	 X.set_data(); return;
		
			    }
			               
	         
	        } //
	        
	       if (n == 0)  return;
	       if (n == 2) {
	    	   
	    	       System.out.println("Enter username : ");
			       Scanner name = new Scanner(System.in);
			        String user = name.nextLine();
		    	     System.out.println("Enter the Password System");
			    	  Scanner ad = new Scanner(System.in);
			    	  if (ad.nextLine().equals(sign)) { 
		    	   System.out.println("\n        | Welcoume " + user + " |\n");
			        print_system();
		            Scanner id = new Scanner(System.in);
		            int test = id.nextInt();
			            switch(test) {
					     case 1:
					      if ( j == 0 ) System.out.println("The system is empty.. ");
					      else { 
					    	  d.cnt = 1;
						        for (int i = 0; i < r; i++) {
						        	pd[i].display_data();
				                   System.out.print("\n");
						        }
						      d.cnt = 1;  
					        }
			                break; 
					     case 2:
					    	 System.out.println("Enter id");
					    	int id1;
					    	Scanner n1 = new Scanner(System.in); 
					    	id1 = n1.nextInt();
					    	if (id1 <= r) 
					    		for (int i = id1 - 1; i < id1; i++) {
						        	pd[i].display_data();
				                   System.out.print("\n");
					    		}   
					    	
					    	else System.out.println("Not found....");	
					    	break;
					     case 3: 
				           return;    
					    	
			            } 	 
			            
			       }
		    	  else {
			    	   System.out.println("in valid password");
			    	   break;
		           }
	       }
	       
	       if (n >= 3)  System.out.println("in valed number :: ");
	      
	       System.out.println("do you want continue ? (y) : (n) ");
           Scanner c = new Scanner(System.in);
           choose = c.next().charAt(0);
             
            
		}while(choose == 'y');   
	}
		
}
