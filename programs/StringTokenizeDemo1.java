import java.util.StringTokenizer;  
public class StringTokenizeDemo1{  
 public static void main(String args[]){  
   StringTokenizer st = new StringTokenizer("My name is Sumit chugh"," ");  
     while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken());
		  }
		  System.out.println(st.countTokens());
   }  
}