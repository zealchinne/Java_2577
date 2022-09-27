class TestErrors 
{
	int a=100;//
	int add(int a, int b) {
		return a*b;
	}
	public static void main(String[] args) 
	{
		TestErrors e=new TestErrors();
		System.out.println(e.add(5,9));
		//System.out.println("Hello World!");
	}
}
