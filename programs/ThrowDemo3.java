public class ThrowDemo3{
static void validate(int age){
if(age<18)
throw new ArithmeticException("not valid");
else
System.out.println("welcome to the Anudip foundation");
}
public static void main(String args[]){
validate(20);
}
}