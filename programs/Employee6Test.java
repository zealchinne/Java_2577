public class Employee6Test 
	{
		public static void main(String[] args) {
	Employee6 e =new Employee6();
	Employee6 e1 =new Employee6();
//setting bean values
e.setId(102);
e.setName("Raju");
e.setActive(false);
e1.setId(104);
e1.setName("Joju");
e1.setActive(true);
//getting bean value
System.out.println("EMP Id : "+e.getId());
System.out.println("EMP : "+e.getName());
System.out.println("EMP : "+e.isActive());
System.out.println("EMP Id : "+e1.getId());
System.out.println("EMP : "+e1.getName());
System.out.println("EMP : "+e1.isActive());
}
}