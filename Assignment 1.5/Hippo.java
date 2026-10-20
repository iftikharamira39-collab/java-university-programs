package assignment1;

public class Hippo extends Animal {

	    public Hippo(String name, int age, double weight, String picture,
	                 String food, int hunger, String boundaries, String location) {
	        super(name, age, weight, picture, food, hunger, boundaries, location);
	    }

	    @Override
	    public void makeNoise() {
	        System.out.println(getName() + "grunts");
	    }

	    @Override
	    public void roam() {
	        System.out.println(getName() + "moves slowly");
	    }
	}
