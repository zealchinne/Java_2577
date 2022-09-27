class CollectionDemo 
{
	public static void main(String[] args) 
	{
		private static void print(Collection c) {
 Iterator i = c.iterator();
 while (i.hasNext()) {
 Object o = i.next();
 System.out.println(o);
 }
}
 //System.out.println("Hello World!");
	}
}
