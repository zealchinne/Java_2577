// java Lambda expression - single paramenter
interface Sayable
{
	public String say(String name);
}
class  LambdaExpression5
{
	public static void main(String[] args) 
	{
		Sayable s=(msg) -> { 
			String str1 = "I would like to say,";
			String str2 = str1+msg;
			return str2; };
			System.out.println(s.say("Time is precious."));
			System.out.println(s.say("Time is money."));
	}
}
