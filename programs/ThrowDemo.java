public class ThrowDemo{
static void validate(int age){
if(age<24)
throw new ArithmeticException("not valid");
else
System.out.println("welcome to the club");
}
public static void main(String args[]){
validate(25);
System.out.println("code remainder");
}
}