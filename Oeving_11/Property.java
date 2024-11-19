package Oeving_11;

public class Property {

  private final String municipality;
  private final int municipalityNr;
  private final int farmNr;
  private final int plotNr;
  private final String plotName;
  private double area; // This should not be final since it can be changed (plots can expand if more land is bought?)
  private String owner; // The owner can also vary, so both this and the area should have set methods.

  /**
   * @param municipality
   * @param municipalityNr
   * @param farmNr
   * @param plotNr
   * @param plotName
   * @param area
   * @param owner
   */
  public Property(String municipality, int municipalityNr, int farmNr, int plotNr, String plotName, double area, String owner) {
    this.municipality = municipality;
    this.municipalityNr = municipalityNr;
    this.farmNr = farmNr;
    this.plotNr = plotNr;
    this.plotName = plotName;
    this.area = area;
    this.owner = owner;
  }

  // GET METHODS --------------------------------------------------------

  public String getMunicipality() {
    return municipality;
  }

  public int getMunicipalityNr() {
    return municipalityNr;
  }

  public int getFarmNr() {
    return farmNr;
  }

  public int getPlotNr() {
    return plotNr;
  }

  public String getPlotName() {
    return plotName;
  }

  public double getArea() {
    return area;
  }

  public String getOwner() {
    return owner;
  }

  // SET METHODS --------------------------------------------------------

  public void setArea(double area) {
    this.area = area;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  // Unique ID Method ---------------------------

  public String uniqueID() {
    return String.format(
        "%s-%s/%s",
        municipalityNr, farmNr, plotNr
    );
  }

  // toString Method ---------------------------

  @Override
  public String toString() {
    return String.format(
        "Municipality: %s\nMunicipality no: %s\nFarm no: %s\nPlot no: %s\nPlot name: %s\nArea: %s\nOwner: %s\n",
        municipality, municipalityNr, farmNr, plotNr, plotName, area, owner
    );
  }
}