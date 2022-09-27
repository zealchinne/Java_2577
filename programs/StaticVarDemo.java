class StaticVarDemo 
{
	static int a= 50; // static variable

	void read()
	{
		int z= this.a; //
		int b = 100; // Local variable
		System.out.println(b);
		System.out.println(z);
	}

	public static void main(String[] args) 
	{
		StaticVarDemo o = new StaticVarDemo();
		o.read();
		double d=98.50; // Intance variable
		System.out.println(a);
		System.out.println(d);
	}
}
