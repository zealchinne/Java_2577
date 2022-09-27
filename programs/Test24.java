@FunctionalInterface
interface Interf
{
	public int cube(int n);
}

 class Test24 {
	public static void main(String[] args) 
	{
		Interf i= n -> n*n*n;
		System.out.println(	i.cube(5));
		System.out.println(	i.cube(9));
	}
}
