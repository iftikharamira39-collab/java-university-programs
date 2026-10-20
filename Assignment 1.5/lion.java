package assignment1;

public class lion extends Animal {

 public lion(String name, int age, double weight, String picture,
             String food, int hunger, String boundaries, String location) {
     super(name, age, weight, picture, food, hunger, boundaries, location);
 }

 @Override
 public void makeSound() {
     System.out.println(getName() + "roars");
 }

 @Override
 public void roam() {
     System.out.println(getName() + "stalks its territory");
 }
 
}
