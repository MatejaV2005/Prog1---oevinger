package Oeving_3;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;

public class C1 {
    public static void main(String[] args) {
        Scanner gangetabell = new Scanner(System.in);
        System.out.print("skriv fra hvor gangetabellen skal starte: ");
        int num1 = gangetabell.nextInt();

        System.out.print("skriv til hvor gangetabellen skal slutte: ");
        int num2 = gangetabell.nextInt();

        ArrayList<Integer> num_list = new ArrayList<Integer>();

        do {
            num_list.add(num1);
            num1++;
        } while (num1 <= num2);

        // her så er det en for løkke som definerer variabelen som skal iterere (num) og hva den skal parse gjennom (num_list)
        for (int num : num_list) {
            for (int i = 0; i < 10; i++) {
                System.out.println(num + " x " + (i + 1) + " = " + (num * (i + 1))); //istedenfor num (variabel som itererer, så skrev du num1, så den ville bare lage repetetive gangelister
            }
            System.out.println();
        }
    }
}

//Alternative form, bruker iteratoren for å printe hvert nummer i listen, it.hasNext() kjører så lenge array listen har et tall den skal gå igjennom
            /*

            Iterator<Integer> it = num_list.iterator();

            while (it.hasNext()) {
            int num = it.next(); //her lo feilen, du glemte å lage en variabel som faktisk hentet ut de itererte nummerene i listen.
            for (int i = 0; i < 10; i++) {
                System.out.println(num + " x " + (i + 1) + " = " + (num * (i + 1))); //istedenfor num (variabel som itererer, så skrev du num1, så den ville bare lage repetetive gangelister
            }
            System.out.println();*/


















        

