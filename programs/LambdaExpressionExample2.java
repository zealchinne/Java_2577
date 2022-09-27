//LambdaExpression multiple parameters
interface Addable
{
	int add(int a, int b);
}
class LambdaExpressionExample2 
{
	public static void main(String[] args) 
	{
		Addable ad=(a,b) -> (a+b); // multiple parameters with lambda
		System.out.println(ad.add(100,200));
		Addable ad1=(a,b) -> (a+b); // multiple parameters with lambda
		System.out.println(ad1.add(500,200));
	}
}
