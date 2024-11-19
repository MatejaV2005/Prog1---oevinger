package Oeving_10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Meny {
  // denne klassen skal legge til retter, kan bruke hashmap slik
  List<Rett> meny = new ArrayList<>();


  public void addRett(Rett nyRett) {
    meny.add(nyRett);
  }

  public double totalPrice() {
    return meny.stream().mapToDouble(Rett::getPrice).sum();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Meny:\n");
    for (Rett rett : meny) {
      sb.append(rett).append("\n");
    }
    return sb.toString();
  }
}
