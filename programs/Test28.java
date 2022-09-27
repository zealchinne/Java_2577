//A functional Interface can have methods of Object class --> Object class is the root class for all class
@FunctionalInterface
interface Sayable
{
	void say(String msg); // abstract method
	int hashCode();
	String toString();
	boolean equals(Object obj);
}
class Test28 implements Sayable 
{
	public void say(String msg) {
			System.out.println(msg); }

	public static void main(String[] args) 
	{
		Test28 t=new Test28();
		t.say("I'm here");
	}
}
