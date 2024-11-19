package Oeving_10;

import java.util.ArrayList;
import java.util.List;

public class J2 {
  public static void main(String[] args) {
    Rett rett1 = new Rett("Pasta bolognese", "Hovedrett", 75.00, "Pasta blandet med en bolognese saus");
    Rett rett2 = new Rett("Suppe", "forrett", 45.00, "Suppe med ting oppi");
    Rett rett3 = new Rett("Ostekake", "dessert", 65.00, "Ostekake med kjekksbunn og jordbær");
    Rett rett4 = new Rett("Kylling alfredo", "Hovedrett", 89.00, "Pasta med kylling og alfredo-saus");

    MenyRegister register = new MenyRegister();
    register.registerDish(rett1);
    register.registerDish(rett2);
    register.registerDish(rett3);
    register.registerDish(rett4);

    List<Rett> MenyRetter = new ArrayList<>();
    MenyRetter.add(rett1);
    MenyRetter.add(rett2);

    List<Rett> MenyRetter2 = new ArrayList<>();
    MenyRetter2.add(rett3);
    MenyRetter2.add(rett4);

    register.registerNewMenu(MenyRetter);
    register.registerNewMenu(MenyRetter2);
    register.totalPriceOfMenusInInterval(80.0, 130.0);

    System.out.println("__________________________________");
    register.findDishByName("Pasta bolognese");
    register.findDishByName("Hovedrett");
    register.findDishByCategory("Hovedrett");
    System.out.println("__________________________________");
    register.printAllMenus();


  }
}
