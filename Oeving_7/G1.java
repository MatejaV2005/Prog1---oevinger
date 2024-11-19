package Oeving_7;
import java.util.Scanner;

public class G1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv inn en tekststreng:");
        String streng = scan.nextLine();

        NyString a = new NyString(streng);
        System.out.println(a.Forkorting());


        System.out.println("Skriv inn en bokstav du vil fjerne");
        char bokstav = scan.nextLine().charAt(0);

        System.out.println(a.Fjerning(bokstav));


    }
}
