package Oeving_10;

import java.util.ArrayList;
import java.util.List;

public class MenyRegister {
  List<Rett> newRett = new ArrayList<>();
  List<Meny> Menyer = new ArrayList<>();

  public void registerDish(Rett registered) {
    newRett.add(registered);
  }

  public void findDishByName(String name) {
    double nyrett = newRett.stream()
        .filter(rettToFind -> rettToFind.getName().equalsIgnoreCase(name))
        .peek(System.out::println)
        .count();

    if (nyrett == 0) {
      System.out.println("fant ikke rett under dette navnet");
    }
  }

  public void findDishByCategory(String category) {
    boolean nyrett = newRett.stream()
        .filter(rettToFind -> rettToFind.getCategory().equalsIgnoreCase(category))
        .peek(System.out::println)
        .count() > 0;

    if (!nyrett) {
      System.out.println("fant ikke rett under denne kategorien");
    }
  }

  public void registerNewMenu(List<Rett> MenyToRegister) {
    Meny toRegister = new Meny();
    for (Rett toMeny : MenyToRegister) {
        toRegister.addRett(toMeny);
    }
    Menyer.add(toRegister);
  }

  public void totalPriceOfMenusInInterval(double min, double max) {
    for (Meny meny : Menyer) {
      double totalPrice = meny.totalPrice();
      if (totalPrice >= min && totalPrice <= max) {
        System.out.println("Pris av menyen: " + totalPrice);
        System.out.println(meny); // Print menyen hvis prisen er innenfor intervallet
      }
    }
  }

  public void printAllMenus() {
    if (Menyer.isEmpty()) {
      System.out.println("Ingen menyer");
    }
  else {
      for (Meny meny : Menyer) {
        System.out.println(meny);
      }
    }
  }
}
