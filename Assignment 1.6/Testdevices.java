package assignment1;

public class Testdevices {
	    public static void main(String[] args){

	        Laser l1 = new Laser();
	        Laser l2 = new Laser();
            Scanner s1 = new FlatbedScanner();
	        Scanner s2 = new FlatbedScanner();
            Multi m1 = new Multi();
	        Multi m2 = new Multi();

	        l1.print("This is a test");
	        l2.print("This is a test");
            s1.scan("This is a test");
	        s2.scan("This is a test");
            m1.scan("This is a test");
	        m2.scan("This is a test");
            m1.print("This is a test");
	        m2.print("This is a test");
	    }
	}
