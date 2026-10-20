package assignment1;

public class Laser extends Device implements Printer{

	    private static int count = 0;
        public Laser(){
	        count++;
	        deviceID = "Laser" + count;}

	    @Override
	    public void print(String printText) {
	        System.out.println("Laser " + deviceID + " responding");
	        System.out.println("..printing:");
	        System.out.println(printText);
	    }
	}
