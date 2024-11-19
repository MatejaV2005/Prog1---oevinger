package Oeving_1;
import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner konvertScanner = new Scanner(System.in);
        System.out.print("Skriv inn sek som skal bli gjort om til h, min og sek: \n");
        int sekunder = konvertScanner.nextInt();

        
        int timer = sekunder / 3600;
        int gjenværendeSekunder = sekunder % 3600;
        int minutter = gjenværendeSekunder / 60;
        int sekunderTilbake = gjenværendeSekunder % 60;
        


        
        System.out.println(timer + " timer, " + minutter + " minutter, " + sekunderTilbake + " sekunder");
    }
}

