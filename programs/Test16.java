import java.util.function.*;
class Test16 
{
	public static void main(String[] args) 
	{
		Function <Integer,Integer> f = i->i*i*i;
		System.out.println("Cube of 5:"+f.apply(5));
	}
}
