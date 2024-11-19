package oeving_5_ny;
import java.util.Scanner;

public class E1 {

    public static void main(String[] args) {
        // HUSK Å LEGGE TIL AT DU KAN VELGE EN EVENTUELL NEVNER, OG IKKE AT DU MÅ NØDVENDIGVIS VELGE EN!!!!
        Scanner scanner = new Scanner(System.in);
        System.out.println("velg en teller, så en eventuell nevner:");
        int Teller1 = scanner.nextInt();
        int Nevner1 = scanner.nextInt();

        scanner.nextLine();

        System.out.println("velg en ny teller, så en eventuell ny nevner:");
        int Teller2 = scanner.nextInt();
        int Nevner2 = scanner.nextInt();

        scanner.nextLine();
        System.out.println("""
                skriv inn følgende input for å regne mellom brøkene:    \
                
                1. addisjon\s
                2. subtrasjon\s
                3. multiplikasjon\s
                4. divisjon""");
        int input = scanner.nextInt();

        Brøk a = new Brøk(Teller1, Nevner1);
        Brøk b = new Brøk(Teller2, Nevner2);

        switch (input) {
            case 1:
                System.out.println(a.addisjon(b).toString());
                break;

            case 2:
                System.out.println(a.subtrahering(b).toString());
                break;

            case 3:
                System.out.println(a.multiplikasjon(b).toString());
                break;

            case 4:
                System.out.println(a.divisjon(b).toString());
                break;

            default:
                System.out.println("ugyldig valg");
                break;
        }
    }
}

