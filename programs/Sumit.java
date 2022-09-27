import java.util.*;
import java.util.Scanner;


public class Sumit {
    String st;
    	
	public static void main(String args[])
	{  String mydelim = " ";
		
	 Scanner sc = new Scanner(System.in);   
    System.out.println("Enter Name");

    String mystr = sc.nextLine();
      StringTokenizer st =
            new StringTokenizer(mystr, mydelim);
	
	 while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken());  
     }  
	}}