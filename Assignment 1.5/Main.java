package assignment1;

public class Main {
	    public static void main(String[] args) {
	        lion lion = new lion("Leo", 5, 200 , "lion.jpg", "meat", 50, "640x480", "x=10,y=20");
	        Dog dog = new Dog("Buddy", 3, 20 , "dog.jpg", "meat", 30, "640x480", "x=50,y=60");

	        lion.makeSound();
	        lion.eat();
	        lion.roam();
	        lion.sleep();

	        dog.makeSound();
	        dog.eat();
	        dog.roam();
	        dog.sleep();
	    }
	}

