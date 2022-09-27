import java.util.*;  
class TestGenerics1{  
public static void main(String args[]){  
ArrayList<String> list=new ArrayList<String>();  
list.add("rahul");  //[0]
list.add("jai"); 
list.add("Anudip"); 
//list.add(2);//compile time error  

String s=list.get(2);//type casting is not required  
System.out.println("element is: "+s);  
  
Iterator<String> itr=list.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}