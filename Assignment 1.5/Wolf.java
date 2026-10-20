package assignment1;

public class Wolf extends Animal {

    public Wolf(String name, int age, double weight, String picture,
                String food, int hunger, String boundaries, String location) {
        super(name, age, weight, picture, food, hunger, boundaries, location);
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + "howls");
    }

    @Override
    public void roam() {
        System.out.println(getName() + "moves in packs");
    }
}