import java.util.*; 
 public class ListExample1{ 
 public static void main(String args[]){ 
 //Creating a List 
 List<String> list=new ArrayList<String>(); 
 //Adding elements in the List 
 list.add("Mango"); 
 list.add("Apple"); 
 list.add("Banana"); 
 list.add("Grapes"); 
 //Iterating the List element using for-each loop 
 for(String fruit:list) // for-each loop
 System.out.println(fruit);
 }
 }