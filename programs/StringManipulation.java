//Java string manipulation example:
import java.util.Scanner;
public class StringManipulation {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in); // Hi
String s = sc.nextLine();
System.out.println(display(s));
}
public static String display(String s) {
StringBuffer sb = new StringBuffer();
char a = s.charAt(0);
char b = s.charAt(1);
System.out.println(sb);
}
}
