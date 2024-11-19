import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Skriv inn antall tommer: ");
            
            
            double tommer = scanner.nextDouble();
            double centimeter = 2.54 * tommer;
            
            System.out.printf("%.2f tommer = %.2f centimeter \n", tommer, centimeter);
        }

        // Testdatasett
        double[] testverdier = {2, 4, 16, 64};
        for (double verdi : testverdier) {
            double resultat = 2.54 * verdi;
            System.out.printf("%.2f tommer = %.2f centimeter \n", verdi, resultat);
            
        }
    }
}