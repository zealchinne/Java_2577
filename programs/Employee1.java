class Employee1
{
	int empcode;
	String name;
	String city;

public void student(int empcode, String name, String city)
	{
	this.empcode=empcode;
	this.name=name;
	this.city=city;
	}
public String toString()
	{
		return empcode+" "+name+" "+city; 
		}
public static void main(String args[]){
Employee1 e1 = new Employee1(350,"Rohan","Kolkata");
Employee1 e2=new Employee1(351,"Priya","Noida");
System.out.println(e1);
System.out.println(e2);
}
}
