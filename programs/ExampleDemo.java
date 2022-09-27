class ExampleDemo
{
	static int z=1000; // static variable
	int i=50; // variable declaration 
	void readInput() // method declaration
	{
		int x=100; // local variable
		System.out.println("Method creation");
	}
	
	public static void main(String[] args) 
	{
		int y=500; //intance variable
	//	ExampleDemo e = new ExampleDemo(); // intance variable cration
		//System.out.println(e.i);
		//e.readInput();
		System.out.println(y);
		System.out.println(z);
	}
}
