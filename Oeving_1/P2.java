import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        try (Scanner tidScanner = new Scanner(System.in)) {
            System.out.print("Skriv inn antall timer, minutter og sekunder: \n");
            
            
            double timer = tidScanner.nextInt();
            double minutter = tidScanner.nextInt();
            double sekunder = tidScanner.nextInt();
            
            
            double totalSekunder = (timer * 3600) + (minutter * 60) + sekunder;
            System.out.println("Totalt antall sekunder: " + totalSekunder);
        }

        
        
        //TESTDATA
        for (int i = 1; i < 20; i++) {
            double totsek = (i * 3600) + (i * 60) + i;
            System.out.println("Totalt antall sekunder: " + totsek);
        }
            
    }
}
