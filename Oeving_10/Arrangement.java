package Oeving_10;

public class Arrangement {
  private int number;
  private String name;
  private String place;
  private String organizer;
  private String type;
  private long date;


  Arrangement(int number, String name, String place, String organizer, String type, long date) {
    this.number = number;
    this.name = name;
    this.place = place;
    this.organizer = organizer;
    this.type = type;
    this.date = date;
  }


  public int getNumber() {
    return number;
  }

  public String getName() {
    return name;
  }

  public String getPlace() {
    return place;
  }

  public String getOrganizer() {
    return organizer;
  }

  public String getType() {
    return type;
  }

  public long getDate() {
    return date;
  }

  @Override
  public String toString() {
    return
        place+ "={ " +
        "\nentydig nummer: " + number +
        "\nNavn: " + name +
        "\nSted: " + place +
        "\nOrganisator: " + organizer +
        "\ntype: " + type +
        "\ndato: " + date + "\n}";
  }
}
