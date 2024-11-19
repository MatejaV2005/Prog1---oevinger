package Oeving_10;

import java.util.Scanner;

public class J1 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrangementRegister reg = new ArrangementRegister(); // oppretter en instans av ArrangementRegister
    boolean running = true;

    while (running) {
      System.out.println("Skriv inn entydig nummer, navn på arrangement, sted, organisator, type og dato:\n");
      int number = scan.nextInt();
      scan.nextLine();
      String name = scan.nextLine();
      String place = scan.nextLine();
      String organizer = scan.nextLine();
      String type = scan.nextLine();
      long date = scan.nextLong();


      Arrangement newArrangement = new Arrangement(number, name, place, organizer, type, date);
      reg.registerArrangement(newArrangement);


      boolean continueRunning = true;
      while (continueRunning) {
        System.out.println("Vil du\n"
            + "1) legge til nytt arrangement\n"
            + "2) finne arrangement på et gitt sted\n"
            + "3) finne arrangement på en gitt dato\n"
            + "4) finne arrangementer i et gitt intervall\n"
            + "5) skrive ut alle arrangementer\n"
            + "6) avslutte programmet");

        int input = scan.nextInt();
        scan.nextLine();

        switch (input) {
          case 1:
            continueRunning = false; // gå ut av indre løkken og til ytre
            break;

          case 2:
            System.out.println("Hvilket sted vil du lete etter arrangementer?");
            String placeForArrangement = scan.nextLine();
            reg.findArrangementByPlace(placeForArrangement);
            break;

          case 3:
            System.out.println("Hvilken dato vil du lete etter arrangementer?");
            long dateForArrangement = scan.nextLong();
            reg.findArrangementByDate(dateForArrangement);
            break;

          case 4:
            System.out.println("Ved hvilke to datoer vil du lete etter arrangementer?");
            long startDate = scan.nextLong();
            long endDate = scan.nextLong();
            reg.arrangementsInInterval(startDate, endDate);
            break;

          case 5:
            reg.allArrangements();
            break;

          case 6:
            System.out.println("Avslutter programmet.");
            scan.close();
            running = false; // gå ut av outer loop
            break;

          default: // Handle invalid input
            System.out.println("Ugyldig valg, prøv igjen.");
            break;
        }
      }
    }
  }
}
