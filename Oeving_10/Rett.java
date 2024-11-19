package Oeving_10;

public class Rett {
  private String name;
  private String category;
  private double price;
  private String recipe;

  Rett(String name, String category, double price, String recipe) {
    this.name = name;
    this.category = category;
    this.price = price;
    this.recipe = recipe;
  }

  // GETTERS----------------------------------

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public String getCategory() {
    return category;
  }

  public String getRecipe() {
    return recipe;
  }

  @Override
  public String toString() {
    return name + ", " + price + "kr, " + category + ", " + recipe;
  }
}