package Oeving_7;
import java.util.Scanner;

public class G2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv inn en tekststreng (Helst feilfri): \n");
        String InsertText = scan.nextLine();
        Tekstbehandling text = new Tekstbehandling(InsertText);


        System.out.println(text.AntallOrd());
        System.out.println(text.AverageOrdlengde());
        System.out.println(text.AvrgOrdPerPeriode() + "\n");

        System.out.println("velg et ord du har lyst å erstatte:\n");
        String OldWord = scan.nextLine();

        System.out.println("velg det ordet du har lyst å erstatte det med:\n");
        String NewWord = scan.nextLine();

        String NyText = text.ErstattOrd(OldWord, NewWord);
        System.out.println("den nye teksten din etter erstatning:\n"+NyText+"\n");
        System.out.println("Texten din i store  bokstaver:\n" +text.UpperCase() + "\n");
        System.out.println("Originale texten din:\n" + text.OriginalText());
    }
}
