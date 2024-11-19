package Oeving_4;
import java.util.Scanner;

public class D1 {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        Valuta a = new Valuta();

        while (true) {

            System.out.println("Velg en valuta: \n 1: Euro \n 2: dollar \n 3: svenske-kroner \n 4: avslutt \n");
            int input = UserInput.nextInt();

            if (input == 4) {
                System.out.println("takk for din tid");
                break;
            }

            UserInput.nextLine();
            System.out.println("vil du gjøre om fra eller til?");
            String fra_til = UserInput.nextLine();

            System.out.println("Skriv inn hvor mye du vil gjøre om: ");
            double quantity = UserInput.nextInt();

            switch (input) {
                case 1:
                    if (fra_til.equals("fra")) {
                        double exchangeEUR = a.NOKtilEUR(quantity);
                        System.out.println(quantity + "kr = " + exchangeEUR + "€ \n");
                    } else if (fra_til.equals("til")) {
                        double exchangeNOK = a.EURtilNOK(quantity);
                        System.out.println(quantity + "€ = " + exchangeNOK + "kr \n");
                    } else {
                        System.out.println("Ugyldig svar. Vennligst skriv 'fra' eller 'til'. \n");
                    }
                    break;

                case 2:
                    if (fra_til.equals("fra")) {
                        double exchangeUSD = a.NOKtilUSD(quantity);
                        System.out.println(quantity + "kr = " + exchangeUSD + "$ \n");
                    } else if (fra_til.equals("til")) {
                        double exchangeNOK = a.USDtilNOK(quantity);
                        System.out.println(quantity + "$ = " + exchangeNOK + "kr \n");
                    } else {
                        System.out.println("Ugyldig svar. Vennligst skriv 'fra' eller 'til'. \n");
                    }
                    break;

                case 3:
                    if (fra_til.equals("fra")) {
                        double exchangeSEK = a.NOKtilSEK(quantity);
                        System.out.println(quantity + "kr = " + exchangeSEK + "SEK \n");
                    } else if (fra_til.equals("til")) {
                        double exchangeNOK = a.SEKtilNOK(quantity);
                        System.out.println(quantity + "SEK = " + exchangeNOK + "kr \n");
                    } else {
                        System.out.println("Ugyldig svar. Vennligst skriv 'fra' eller 'til'. \n");
                    }
                    break;

                default:
                    System.out.println("Ugyldig svar. Prøv igjen. \n");
                    break;
            }
        }
    }
}


