@FunctionalInterface
interface Interf
{
	public void m1();// abstact method 
}
class Test21 implements Interf
{
	public void m1()//overriden 
	{
		System.out.println("Default method");
	}
	public static void m2()
	{
		System.out.println("Static method");
	}
	public static void main(String[] args) 
	{
		Test21 t=new Test21();
		t.m1();
		m2();
	}
}
