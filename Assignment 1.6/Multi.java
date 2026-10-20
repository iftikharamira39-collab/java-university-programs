package assignment1;

public class Multi extends Device implements Printer, Scanner {

    private static int count = 0;
   public Multi() {
        count++;
        deviceID = "Multi" + count;
    }

    @Override
    public void print(String printText) {
        System.out.println("Multi " + deviceID + " responding");
        System.out.println("...printing:");
        System.out.println(printText);
    }

    @Override
    public void scan(String scanText) {
        System.out.println("Multi " + deviceID + " responding");
        System.out.println("..scanning");
        System.out.println(scanText);
    }
}