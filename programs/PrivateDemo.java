// Private access modifier
class Data {
private String name;

public String getName() {
return this.name;
}
public void setName(String name) {
this.name = name;
} }

public class PrivateDemo {
public static void main(String[] main){
Data d = new Data();
d.setName("Anudip");
System.out.println(d.getName());
}
}