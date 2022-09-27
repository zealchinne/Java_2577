public class ArrayObjProgram {
public static void main(String[] args) {
Object[] elements = new Object[4];
elements[0] = "elephant";
elements[1] = 60;
elements[2] = new StringBuilder("xyz");
elements[3] = 3.4;
for (Object e : elements) {
System.out.println(e);
}
}
}