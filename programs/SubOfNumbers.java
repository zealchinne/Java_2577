import java.util.Scanner;  
public class SubOfNumbers 
{  
public static void main(String args[])  
{  
int x, y, sub;  
Scanner sc = new Scanner(System.in); // creating object of Scanner class 
System.out.print("Enter the first number: ");  
x = sc.nextInt();  
System.out.print("Enter the second number: ");  
y = sc.nextInt();  
//logic of the program
sub = sub(x, y);  
System.out.println("The Substration of two numbers x, y is: " + sub);  
}  
public static int sub(int a, int b)  
{  
int sub = a - b;  
return sub;  
}  
}  