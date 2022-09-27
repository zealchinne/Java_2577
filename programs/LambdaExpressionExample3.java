// Java lambda expression with or without return keyword
interface Addable
{
	int mul(int a, int b);
}
class LambdaExpressionExample3
{
	public static void main(String[] args) 
	{
		Addable ad=(a,b) -> a*b;
		System.out.println(ad.mul(5,20));
		}
}
