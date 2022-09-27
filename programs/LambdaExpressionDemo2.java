// parameter no argument
interface Sayable
{
	public String say();
}
class LambdaExpressionDemo2 
{
	public static void main(String[] args) 
	{
		Sayable s=() -> { return "I have nothing to say"; };
		System.out.println(s.say());
	}
}
