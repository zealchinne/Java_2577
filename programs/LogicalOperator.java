import java.util.Scanner;
class LogicalOperator 
{
	public static void main(String[] args) 
	{
		String x = "Anudip";
		String y = "1234";
		Scanner s = new Scanner(System.in);
		System.out.print("Enter username:");
		String uuid = s.next();
		System.out.print("Enter password:");
		String upwd = s.next();

		if ((uuid.equals(x) && upwd.equals(y)) || (uuid.equals(y) && upwd.equals(x))) {
			System.out.println("Welcome");
	}
	else System.out.println("Wrong ID and PWD");
}// main method
}// end class