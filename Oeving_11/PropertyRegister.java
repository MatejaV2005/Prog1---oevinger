package Oeving_11;
import java.util.List;
import java.util.ArrayList;

public class PropertyRegister {
  List<Property> properties = new ArrayList<Property>();

  /**
   * Registers a new property by adding it to the properties list.
   *
   * @param property the Property object to be added
   */
  public void registerProperty(Property property) {
    properties.add(property);
  }

  /**
   * Deletes a property based on its unique ID.
   * If a property with the specified ID exists, it will be removed from the list.
   *
   * @param id the unique ID of the property to be deleted
   */
  public void deleteProperty(String id) {
    properties.removeIf(property -> property.uniqueID().equals(id));
  }

  /**
   * Counts the total number of properties in the register.
   *
   * @return the count of properties as an integer
   */
  public int count() {
    return properties.size();
  }

  /**
   * Searches for a property by its unique ID and prints it if found.
   * If a property with the given ID is found, it is printed to the console.
   *
   * @param id the unique ID of the property to be found
   */
  public void propertyById(String id) {
    properties.stream()
        .filter(byID -> byID.uniqueID().equals(id))
        .findFirst()
        .ifPresent(System.out::println);
  }

  /**
   * Calculates the average area of all registered properties.
   *
   * @return the average area of the properties as a double
   */
  public double avgAreaOfProperties() {
    double avgArea = properties.stream()
        .mapToDouble(Property::getArea).sum();
    return avgArea / properties.size();
  }

  /**
   * Lists all properties with a given farm number.
   * Properties with a farm number matching the specified number are printed to the console.
   *
   * @param number the farm number used to filter properties
   */
  public void propertiesOfGivenFarmNr(int number) {
    properties.stream()
        .filter(byFarmNo -> byFarmNo.getFarmNr() == number)
        .forEach(System.out::println);
  }

  /**
   * Prints all registered properties to the console.
   * If there are no properties, it outputs a message indicating that no properties are registered.
   */
  public void allProperties() {
    if (properties.isEmpty()) {
      System.out.println("No properties registered, please add a property first");
    } else {
      properties.forEach(System.out::println);
    }
  }
}
