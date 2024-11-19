package Oeving_3;
import java.util.Scanner;

public class C2 {
    public static void main(String[] args) {

        while (true) {
            Scanner primtall = new Scanner(System.in);
            System.out.println("Skriv  inn et tall for å sjekke om det er primtall: ");
            int tall = primtall.nextInt();

        // loop for primtall istedenfor if-setninger
            if (tall == 2 || tall == 3) {
                System.out.println("dette er primtall");
            }
            else if (tall % 2 != 0 & tall % 3 != 0) {
                System.out.println("dette er primtall");
            }
            else {
                System.out.println("dette er IKKE et primtall");
            }

            System.out.println("Lyst å fortsette? (Y/N): ");
            primtall.nextLine(); //denne linjen trengs her fordi: nextInt() metoden leser inn integer, men lar igjen newline /n i bufferet. derfor må man lese inn denne newline /n som er igjen i bufferet
            String svar = primtall.nextLine();

            if (svar.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
}


