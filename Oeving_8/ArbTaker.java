package Oeving_8;

public class ArbTaker {

  java.util.GregorianCalendar date = new java.util.GregorianCalendar();
  int år = date.get(java.util.Calendar.YEAR);

  int[] SkattPerMåned = new int[12];

  private Person personalia; // logikken her basically er at vi lager en person variabel av datatypen person,
  // deretter, når vi lager en instans av person så kan vi bruke det og passe det inn som parameter i ArbTaker klassen

  public int arbeidtakernr;
  private int ansettelsesår;
  private int månedslønn;
  private int skatteprosent;


  public ArbTaker(Person person, int arbeidtakernr, int ansettelsesår, int månedslønn,
      int skatteprosent) {
    this.personalia = person;
    this.ansettelsesår = ansettelsesår;
    this.arbeidtakernr = arbeidtakernr;
    this.månedslønn = månedslønn;
    this.skatteprosent = skatteprosent;
  }

  //GET-METODER__________________________________________
  public int getAnsettelsesår() {
    return ansettelsesår;
  }

  public int getArebidertakernr() {
    return arbeidtakernr;
  }

  public int getMånedslønn() {
    return månedslønn;
  }

  public int getSkatteprosent() {
    return skatteprosent;
  }


  //SET-METODER___________________________________________
  public int setMånedslønn(int månedslønn) {
    this.månedslønn = månedslønn;
    return this.månedslønn;
  }

  public int setSkatteprosen(int skatteprosent) {
    this.skatteprosent = skatteprosent;
    return this.skatteprosent;
  }

  //METODER __________________________________________________________________
  public int bruttolønn() {
    int brutto = månedslønn * 12;
    return brutto;
  }

  public void TrekkPerMåned() {
    for (int i = 0; i < SkattPerMåned.length; i++) {
      SkattPerMåned[i] = (månedslønn * skatteprosent) / 100;
      if (i == 5) {
        SkattPerMåned[i] = 0;
      }
      if (i == 11) {
        SkattPerMåned[i] = ((månedslønn * skatteprosent) / 100) / 2;
      }
    }
  }

  public int TrekkPerÅr() {
    int Trekk = 0;
    for (int i : SkattPerMåned) // iterabelen i går gjennom alle verdiene i arrayet. for hevr iterasjon blir den satt til verdien i arrayet.
    {
      Trekk += i;
    }
    return Trekk;
  }

  public int alder() {
    int alder = år - personalia.getFødselsår();
    return alder;
  }

  public int ÅrAnsatt() {
    int ansatt = år - ansettelsesår;
    return ansatt;
  }

  public boolean ÅrAnsattTrueFalse(int parameter) {
    return (år - ansettelsesår) > parameter;
  }

  @Override
  public String toString() {
    return personalia.getEtternavn() + ", " + personalia.getFornavn();
  }

  public String printListe() {
    String[] måneder = {
        "Januar", "Februar", "Mars", "April", "Mai", "Juni",
        "Juli", "August", "September", "Oktober", "November", "Desember"
    };
    String resultat = ""; // Bruker en vanlig String for å bygge resultatet

    System.out.println("Måned | Skattetrekk");
    for (int i = 0; i < SkattPerMåned.length; i++) {
      resultat += måneder[i] + ": " + SkattPerMåned[i] + "kr\n";
    }
    return resultat;
  }

  public void printArbTakerInfo() {
    System.out.println("Navn: " + toString() +
        "\nAlder: " + alder() +
        "\nArbeidertaker nummer: " + getArebidertakernr() +
        "\nAnsatt i: " + getAnsettelsesår());

    System.out.println("Antall år ansatt: " + ÅrAnsatt() +
        "\nMånedslønn: " + getMånedslønn() +
        "\nBruttolønn: " + bruttolønn() + " kr" +
        "\nSkatteprosent: " + getSkatteprosent() + "%");

    System.out.println("Har du jobbet lengre enn gitt parameter? " + ÅrAnsattTrueFalse(13));
    TrekkPerMåned();
    System.out.println(); //mellomrom

    System.out.println(printListe());
    System.out.println("Skattetrekk per år med gitt månedslønn: " + TrekkPerÅr());
  }
}


