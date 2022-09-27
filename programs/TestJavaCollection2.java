	//LinkedList
	import java.util.*;  
	class TestJavaCollection2{  
	public static void main(String args[]){  
	LinkedList<Integer> list=new LinkedList<Integer>();//Creating LinkedList  object
	list.add(55);//Adding object in LinkedList  
	list.add(65);  
	list.add(15);  
	list.add(25);  
	//Traversing list through Iterator  
	Iterator itr=list.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}
	}//main
	}//end class
