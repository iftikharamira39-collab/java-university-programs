package assignment1;

public class Dog extends Animal {
	    public Dog(String name, int age, double weight, String picture,
	               String food, int hunger, String boundaries, String location) {
	        super(name, age, weight, picture, food, hunger, boundaries, location);
	    }

	    @Override
	    public void makeNoise() {
	        System.out.println(getName() + " barks");
	    }

	    @Override
	    public void roam() {
	        System.out.println(getName() + " walks around happily");
	    }
	}

