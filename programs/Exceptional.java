class Exceptional
{
public static void main (String[] args)
{
int[] arr = new int[5]; // array size is 5.
try
{
int i = arr[5]; // the statement cannot ever be executed as an exception is initiated by the statement
System.out.println("within try block");
}
catch(ArrayIndexOutOfBoundsException ex)
{
System.out.println("catch block has an exception");
}
finally
{
System.out.println("finally block is executed");
}
System.out.println("Outside of the try-catch-finally clause");
}
}