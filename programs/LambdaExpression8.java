// Java Lambda expression - Foreach loop
import java.util.*;
class LambdaExpression8 
{
	public static void main(String[] args) 
	{
		List<String> l=new ArrayList<String>();
		l.add("Sumit");
		l.add("Chetan");
		l.add("Preeti");
		l.add("Aman");

		l.forEach(
			(n) -> System.out.println(n) );
	}
}
