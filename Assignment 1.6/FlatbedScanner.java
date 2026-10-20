package assignment1;

public class FlatbedScanner extends Device implements Scanner{

    private static int count = 0;
     public FlatbedScanner() {
        count++;
        deviceID = "FlatBedScanner" + count;
    }

    @Override
    public void scan(String scanText) {
        System.out.println("Scanner " + deviceID + " responding");
        System.out.println("..scanning:");
        System.out.println(scanText);
    }
}