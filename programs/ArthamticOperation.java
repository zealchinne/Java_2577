class ArthamticOperation 
{
	int a=10;
	int b = 15;
	static { System.out.println("Static Block"); }// static block
	void add() // non stastic method
		{
			System.out.println(this.a+this.b);
			 System.out.println("Non Static Method");
		}
	static void mul()// static method
		{ 
			int a=10,b=50;
			System.out.println(a*b); //500
			 System.out.println("Static Method");
		}
	public static void main(String[] args) 
	{
		ArthamticOperation a=new ArthamticOperation(); //Object creation
		mul();
		a.add();
	
			}
}
