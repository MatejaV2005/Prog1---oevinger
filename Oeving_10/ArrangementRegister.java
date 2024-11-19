package Oeving_10;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrangementRegister {
  private HashMap<String, List<Arrangement>> arrangements = new HashMap<>();

  // Registrer arrangementet
  public void registerArrangement(Arrangement event) {
    // Legg til arrangementet i riktig liste basert på stedet
    arrangements.computeIfAbsent(event.getPlace() /*String key til HashMappet*/, k -> new ArrayList<>() /*Value til HashMappet, vi kan derfor sette det som en new arraylist uten å måtte definere en først*/).add(event);
    // det computeIfAbsent gjør er at den "computer" en ny verdi til keyen som blir satt hvis den ikke eksisterer. hvis en verdi til den keyen allerede eksisterer og er ikke null, så forblir mappet uendret.
  }

  // Finn arrangementer basert på sted
  public void findArrangementByPlace(String place) {
    List<Arrangement> foundArrangements = arrangements.getOrDefault(place, new ArrayList<>()); // object key (venstre), er nøkkelen vi vil hente verdien for, ellers så returneres verdien til høyre: en arrayliste
    if (!foundArrangements.isEmpty()) {
      System.out.println("Arrangementer på " + place + ": " + foundArrangements);
    }
    else {
      System.out.println("Det finnes ikke registrerte arrangementer på dette stedet");
    }
  }

  // Finn arrangementer basert på dato
  public void findArrangementByDate(Long date) {
    boolean found = arrangements.values().stream()
        .flatMap(List::stream) // flatmap tar inn (i dette tilfellet) elementer av lister i lister, og ved å referere en stream metodekalling på list, returnerer den tilbake hver av elementene som et individuelt stream-element
        .filter(event -> event.getDate() == date)
        .peek(System.out::println) // .peek() er metode som utfører handling på elementene i stream, uten å avslutte stream-pipelinen. bruker peek istedenfor foreach siden vi kan viderekalle .count metoden
        .count() > 0; // teller antall elementer i streamen, og hvis > 0 setter found til true.

    if (!found) {
      System.out.println("Ingen arrangementer registrert på denne datoen");
    }
  }

  // Finn arrangementer i et gitt intervall
  public void arrangementsInInterval(long dateStart, long dateEnd) {
    boolean found = arrangements.values().stream()
        .flatMap(List::stream) // samme logikk som ovenfor
        .filter(event -> event.getDate() > dateStart && event.getDate() < dateEnd)
        .peek(System.out::println) //samme logikk som ovenfor
        .count() > 0; //samme logikk som ovenfor

    if (!found) {
      System.out.println("Ingen arrangementer registrert i dette intervallet");
    }
  }

  // Skriv ut alle arrangementer
  public void allArrangements() {
    if (arrangements.isEmpty()) {
      System.out.println("Ingen arrangementer registrert");
    }

    arrangements.values().stream()
        .flatMap(List::stream) // samme logikk, tar f.eks noe lignende (arrangements = { "Sted 1" : [arrangement1, arrangement2], // "Sted 2" : [arrangement3]}, så "flater" .flatmap den ut og returnerer de individuelt
        .forEach(event -> System.out.println(event)); // ender streamen med forEach og sier at hver event (valgfritt variabelnavn, typ "i" som in for "i" ...) skal printes
  }
}
