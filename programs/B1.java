// Inheritance 
class A 
{
	int a=25;
	void read()
	{
		System.out.println("A class method");
	}
	}
class B extends A
{
	int c=50;
	void read1()
	{
		System.out.println("B class method");
	}
}

class B1 extends B 
{
	public static void main(String[] args) 
	{
		B1 b=new B1(); 
		b.read();
		b.read1();
		System.out.println(b.a);
	}
}
