class ClassA{
public void disp(){
	System.out.println ("I am within Class A"); 
	}
}
class ClassB extends ClassA{
public void disp(){
	System.out.println ("I am within Class B");
	}
}
public class RunTimePolymorphismDemo{
	public static void main (String args []) {
		ClassA obj1 = new ClassA();
		ClassA obj2 = new ClassB();
obj1.disp();
obj2.disp();
	}
}