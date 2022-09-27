class ArrayIndexOutOfBound_Example {
public static void main(String args[])
{
try {
int a[] = new int[6];
a[7] = 10;
// * accessing 7th element in an array of size 6
}
catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Array Index is Out Of Bounds");
}
}
}