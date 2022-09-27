class ParamerizedConstructor 
{
	int uid;
	String uname;

	ParamerizedConstructor(int id, String name){
		this.uid=id;
		this.uname=name;
	}

	void dispaly()
	{
		System.out.println("ID:   " +uid+"Name: "+uname);
	}
	public static void main(String[] args) 
	{
		ParamerizedConstructor p=new ParamerizedConstructor(100,"Joju");
		p.dispaly();
		System.out.println("Hello World!");
	}
}
