class MyException extends Exception {
int id;
public MyException(int x) {
id = x;
}

public String toString() {
return "CustomException[" + id + "]"; } }

public class Samples {
static void compute(int b) throws MyException {
if (b > 10)
throw new MyException(b);
System.out.println("No prog error. no exception present");
}
public static void main(String args[]) {
try {
compute(6);
compute(13);
} catch(MyException ex1) {
System.out.println(ex1); }
}
}