public class PassingByReference
{
public static void display(int y[])
{
System.out.println(y[0]);//
y[0] = 200;
}
public static void main(String args[])
{
int x[] = { 20, 30, 40 };
System.out.println(x[0]);//20
display(x);//20
System.out.println(x[0]);//200
}
}