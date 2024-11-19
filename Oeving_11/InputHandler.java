package Oeving_11;
import java.util.Scanner;

public class InputHandler {
  static Scanner sc = new Scanner(System.in);

  /**
   * a method that handles inputs of integer/double datatypes
   * @param type
   * @return the input of the user as either a int or a double.
   */
   static Number readNumber(String type) { //Numebr datatype takes in both int and double as datatypes
    while (true) { //try-catch case that runs as long as its true
      try {
        if (type.equals("int")) { //String that contains the description of sought after datatype
          return Integer.parseInt(sc.nextLine()); // reads the input of user as string. ParseInt converts the String to int if the String is valid. returns an int-object and ends the method
        } else if (type.equals("double")) {
          return Double.parseDouble(sc.nextLine()); //same logic, NOTE: return works as a form of break, meaning if a value is returned it will exit while-loop
        }
      } catch (NumberFormatException e) { //if the sc.nextline String isnt valid, catch NumberFormatException. handles the case where the number of user cant be converted to int or double
        System.out.println("Ugyldig input! Vennligst skriv inn et gyldig " + type + ".");
      }
    }
  }
}
