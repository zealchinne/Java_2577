class Student1
	{ 
		int id;
		String name;
		int age;
		Student1(int i,String n) {
			id = i;
			name = n;  }
		Student1(int i,String n,int a) {
				id = i;
				name = n;
				age=a; }

void display()
	{System.out.println(id+" "+name+" "+age);}

public static void main(String args[]){
Student1 s1 = new Student1(101,"Alex"); // 2 argu 
Student1 s2 = new Student1(108,"Joju",30); // 3 argu
s1.display();
}
	}