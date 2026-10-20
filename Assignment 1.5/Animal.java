package assignment1;

public abstract class Animal {
	       private String name;
	       private int age;
	       private double weight;
	       private String picture;
	       private String food;
	       private int hunger;
	       private String boundaries; 
	       private String location;   
	    
	       public Animal(String name, int age, double weight, String picture, String food, int hunger, String boundaries, String location) {
	           this.name = name;
	           this.age = age;
	           this.weight = weight;
	           this.picture = picture;
	           this.food = food;
	           this.hunger = hunger;
	           this.boundaries = boundaries;
	           this.location = location;
	       }
	       
	       public String getName() {
	           return name;
	       }
	       
           public void move() {
	           System.out.println(name + " is moving around.");
	       }
	       
	       public void eat() {
	           System.out.println(name + " is eating " + food);
	       }

	       public void makeSound() {
	           System.out.println(name + " makes a generic animal sound");
	       }

	       public void makeNoise() {
	           System.out.println(name + " makes noise");
	       }

	       public void sleep() {
	           System.out.println(name + " is sleeping");
	       }

	       public void roam() {
	           System.out.println(name + " is roaming the area");
	       }
	   }

