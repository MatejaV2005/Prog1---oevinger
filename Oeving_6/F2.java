package Oeving_6;
import java.util.Scanner;

public class F2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Skriv inn en hvilken som helst tekst-streng (skriv 'avslutt' for å avslutte):");
            String text = sc.nextLine();

            if (text.equalsIgnoreCase("avslutt")) {
                break;
            }

            TekstAnalyse Anlz = new TekstAnalyse(text);

            Anlz.Analyse(); //siden Analyse returnerer VOID, så kaller jeg først på den for å oppdatere antallTegn arrayet.
            System.out.println(Anlz.toString()); // deretter etter det er oppdatert kan jeg kalle på antallTegn med toString, som vil faktisk printe den ut! THUMBS UP CUZ

            System.out.println("antall bokstaver av tekstrengen din: " + Anlz.getLengde());
            System.out.println("Prosentandelen av teksten som består av spesialtegn: " + Anlz.Prosent() + "%");

            System.out.println();
            System.out.println("Velg en bosktav du har lyst å telle forekomset av: ");
            char bosktav = sc.nextLine().charAt(0);

            System.out.println("antall forekomster av valgt bokstav: " + Anlz.forekomster(bosktav));
            System.out.println(Anlz.MestForekomst());
            System.out.println();
        }
    }
}
