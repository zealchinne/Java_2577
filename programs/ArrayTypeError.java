abstract class Animal2 {
 abstract public void speak();
 public void identify() {
 System.out.println("I'm an animal.");
 }
}

class Dog extends Animal2 {
 @Override
 public void speak() {
 System.out.println("woof....");
 }
 @Override
 public void identify() {
 System.out.println("I'm a Dog.");
 }
}
class Cat extends Animal2 {
 @Override
 public void speak() {
 System.out.println("meow");
 }
 @Override
	 public void identify() {
 System.out.println("I'm a Cat.");
 }
}
public class ArrayTypeError {
 public static void main(String[] args) {
 // Create an array of three anonymous dogs
 Dog[] kennel = { new Dog(), new Dog(), new Dog()};
 // Let them all speak
 for (Dog d: kennel) d.speak();
 // Dogs are Objects, so this should work
 Object[] things = kennel;
 things[0] = new Cat();
 }
}

















