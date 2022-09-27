	//ArrayList
	import java.util.*;  
	class TestJavaCollection1{  
	public static void main(String args[]){  
	ArrayList<String> list=new ArrayList<String>();//Creating arraylist  object
	list.add("Aman");//Adding object in arraylist  
	list.add("Manoj");  
	list.add("Sumit");  
	list.add("Manoj");  
	//Traversing list through Iterator  
	Iterator itr=list.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}
	}//main
	}//end class
