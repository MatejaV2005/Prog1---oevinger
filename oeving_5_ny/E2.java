package oeving_5_ny;
import java.util.Scanner;


public class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv inn nedre og øvre grense:");

        // Endre til double
        double nedre = scanner.nextDouble();
        double ovre = scanner.nextDouble();

        MinRandom a = new MinRandom();

        // Test heltall
        for (int i = 0; i < 10; i++) {
            System.out.println("Heltall: " + a.NesteHeltall((int)nedre, (int)ovre)); // Cast til int for NesteHeltall
        }

        System.out.println("\n");

        // Test desimaltall
        for (int i = 0; i < 10; i++) {
            System.out.println("Desimaltall: " + a.nesteDesimaltall(nedre, ovre));
        }
    }
}
