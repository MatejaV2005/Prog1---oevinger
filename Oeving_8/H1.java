package Oeving_8;
import java.util.*;

public class H1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //ArbTaker arb = null; DETTE STO OPPRINNELIG HER. deklarerer arb utenfor løkken slik at den er tilgjengelig globalt, men deklarerer den med null slik at den kan senere i en lokal kodeblokk tilordnes en verdi som vil peke på denne deklareringen i minnet

    //Innlesing av initial informasjon
    System.out.println("Skriv inn: Navn; Etternavn; Fødselsår:");
    String name = sc.nextLine();
    String lastName = sc.nextLine();
    int birthYear = sc.nextInt();
    sc.nextLine();  // Rydder opp etter int-inndata

    // Oppretter Person-objekt
    Person a = new Person(name, lastName, birthYear);

    System.out.println("Skriv inn arbeidertaker nr, ansettelsesår, månedslønn og skatteprosent:");
    int arbeidertakernr = sc.nextInt();
    int ansettelsesår = sc.nextInt();
    int månedslønn = sc.nextInt();
    int skatteprosent = sc.nextInt();
    sc.nextLine();  // Rydder opp etter int-inndata

    // Oppretter ArbTaker-objektet
    ArbTaker arb = new ArbTaker(a, arbeidertakernr, ansettelsesår, månedslønn, skatteprosent);

    //Skriver ut informasjon én gang etter innlesing
    arb.printArbTakerInfo();

    //Gjør det mulig å gjøre endringer etter at informasjonen er printet ut
    while (true) {
      System.out.println("Vil du endre på Skatteprosent/Månedslønn? (Y/N) eller (Q) for å avslutte:");
      String svar = sc.nextLine();

      if (svar.equalsIgnoreCase("q")) {
        System.out.println("Avslutter programmet.");
        break;
      }

      if (svar.equalsIgnoreCase("y")) {
        System.out.println("Vil du (1) endre skatteprosent? (2) endre månedslønn? (3) endre begge?");
        int valg = sc.nextInt();
        sc.nextLine();  // Rydder opp etter int-inndata

        switch (valg) {
          case 1:
            System.out.println("Endre skatteprosenten:");
            int spEndring = sc.nextInt();
            arb.setSkatteprosen(spEndring);
            sc.nextLine();  // Rydder opp etter int-inndata
            break;

          case 2:
            System.out.println("Endre månedslønnen:");
            int mlEndring = sc.nextInt();
            arb.setMånedslønn(mlEndring);
            sc.nextLine();  // Rydder opp etter int-inndata
            break;

          case 3:
            System.out.println("Endre skatteprosenten:");
            int spEndring3 = sc.nextInt();
            arb.setSkatteprosen(spEndring3);

            System.out.println("Endre månedslønnen:");
            int mlEndring3 = sc.nextInt();
            arb.setMånedslønn(mlEndring3);
            sc.nextLine();  // Rydder opp etter int-inndata
            break;
        }

        //Etter endringer, skriv ut oppdatert informasjon
        arb.printArbTakerInfo();
      }
      else if (svar.equalsIgnoreCase("n")) {
        System.out.println("Ingen endringer ble gjort.");
        break;
      }
    }
  }


}