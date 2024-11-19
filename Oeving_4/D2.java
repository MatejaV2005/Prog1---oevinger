package Oeving_4;
import java.util.Scanner;


public class D2 {
    public static void main(String[] args) {
        Terning terning = new Terning();

        Spiller A = new Spiller();
        Spiller B = new Spiller();
        int i = 0;

        while (true) {
            i++;

            System.out.println("Runde: " + i + "\n");

            System.out.println("Spiller A har: " + A.getSumPoeng());
            System.out.println("Spiller B har: " + B.getSumPoeng() + "\n");

            A.kastTerning();
            B.kastTerning();


            if (A.erFerdig()) {
                System.out.println("Gratulerer til spiller A, du vant! || antall runder for å vinne: " + i);
                break;
            }

            else if (B.erFerdig()) {
                System.out.println("Gratulerer til spiller B, du vant! || antall runder for å vinne: " + i);
                break;
            }
        }
    }
}


