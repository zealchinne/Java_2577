// Write Java Program given no is palendram or not
import java.util.Scanner;
class PalendramNo 
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in); // object for scanner class 
		System.out.print("Enter the Value: ");
		int n=s.nextInt();
		int temp = n;
		int rev=0;
		while(n!=0)  //121 // 12
		{
			int r = n%10;  // 1 // 2
			rev = r+rev*10; //(1+0*10) // (2+10)  // 1+ 120 = 121
			n=n/10; //12 // 1
		}
		if(rev==temp)
		{
			System.out.println("The Given No is Palendrom");
		}
		else
		{
			System.out.println("Not Palendrom");
		}
	}
}
