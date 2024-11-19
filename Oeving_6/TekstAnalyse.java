package Oeving_6;

public class TekstAnalyse {
    private final String bokstaver = "abcdefghijklmnopqrstuvwxyzæøå";
    int[] antallTegn = new int[30];
    private String text;

    TekstAnalyse(String text) {
        this.text = text.toLowerCase();
    }

    public int getLengde() {
        int lengde = 0;
        for (char c : text.toCharArray()) {
            if (bokstaver.indexOf(c) != -1) { // Sjekker om bokstaven finnes i 'bokstaver'-strengen. altså hvis indexen til bokstaven IKKE ER -1, så finnes den
                lengde++;
            }
        }
        return lengde;
    }

    // Beregner prosentandelen av tegn som ikke er bokstaver
    public int Prosent() {
        int ikkeBokstaver = 0;
        for (char c : text.toCharArray()) {
            if (bokstaver.indexOf(c) == -1) { // Sjekker om det ikke er en bokstav, ved at den returnerer -1 siden den vil representere en index som ikke er i final bosktaver
                ikkeBokstaver++;
            }
        }
        return (ikkeBokstaver * 100) / text.length(); // regner prosentandelen
    }

    // Returnerer antall forekomster av en gitt bokstav
    public int forekomster(char bokstav) {
        bokstav = Character.toLowerCase(bokstav);
        int index = bokstaver.indexOf(bokstav);
        if (index != -1) {
            return antallTegn[index]; // Returnerer antall forekomster fra arrayet
        }
        return 0;
    }

    // Finne bokstaven eller bokstavene med flest forekomster
    public String MestForekomst() {
        int MaksForekomst = 0;
        String Resultat = "";

        // Teller først den største forekomsten av en bokstav
        for (int i = 0; i < bokstaver.length(); i++) {
            if (antallTegn[i] > MaksForekomst) {
                MaksForekomst = antallTegn[i]; // Oppdater maks forekomst
            }
        }

        // Finn alle bokstaver med maksimal forekomst
        for (int i = 0; i < bokstaver.length(); i++) {
            if (antallTegn[i] == MaksForekomst) {
                Resultat += bokstaver.charAt(i) + " "; // Legger til bokstaven i resultatet
            }
        }

        // Returnerer resultatet som en string
        return "Bokstavene med flest forekomster er: " + Resultat +
                "\nAntall forekomster: " + MaksForekomst;
    }

    // Analyserer teksten og fyller opp antallTegn-arrayen
    public void Analyse() {
        for (char c : text.toCharArray()) {
            int index = bokstaver.indexOf(c);
            if (index != -1) {
                antallTegn[index]++; // Teller bokstaver
            } else {
                antallTegn[bokstaver.length()]++; // Teller ikke-bokstaver
            }
        }
    }

    // Returnerer en oversikt over antall bokstaver
    @Override
    public String toString() {
        String resultat = ""; // Bruker en vanlig String for å bygge resultatet

        for (int i = 0; i < bokstaver.length(); i++) {
            resultat += bokstaver.charAt(i) + ": " + antallTegn[i] + "\n"; // Legger til bokstav og antall
        }

        return resultat; // Returnerer resultatet som en string
    }
}
