// find the Squareroot of the number
import java.util.function.*;
class EvenorOdd
{
public static void main(String[] args) 
	{
		Predicate<Integer> p = i -> i%2==0;
		System.out.println(p.test(4));
		System.out.println(p.test(9));
		}
}
