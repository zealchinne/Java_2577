import java.util.Scanner;
class StudMarks 
{
	public static void main(String[] args) 
	{
		//int m1,m2,m3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks Sub1");
		int m1 =sc.nextInt();
		System.out.println("Enter marks Sub2");
		int m2 =sc.nextInt();
		System.out.println("Enter marks Sub3");
		int m3 =sc.nextInt();
		if((m1>=35)&&(m2>=35)&&(m3>35))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Failed");
		}
	}
}
