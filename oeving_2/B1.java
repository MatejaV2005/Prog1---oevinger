package oeving_2;
import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv inn et år som skal sjekkes om det er skuddår: ");
        int aar = scanner.nextInt();

        if (aar % 4 == 0 && aar % 100 != 0 || aar % 400 == 0) {
            System.out.println("året ditt er et skuddår");
        }
        else {
            System.out.println("året ditt er IKKE et skuddår");
        }
    }
}
