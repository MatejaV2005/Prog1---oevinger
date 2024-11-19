package Oeving_7;

public class Tekstbehandling {
    public String text;
    public String[] array;
    public final String bokstaver = "abcdefghijklmnopqrstuvxyzæøå";


    public Tekstbehandling(String text){
        this.text = text.toLowerCase();
        this.array = text.split("\\s+");
    }


    public String AntallOrd() {
        int result = 0;

        for (String i : array) {
                result += 1;
        }
        return "antall ord i teksten din: " + result;
    }

    public String AverageOrdlengde() {
        int AntallBokstaver = 0;
        int AntallOrd = 0;

        for (char c : text.toCharArray()) {
            if (bokstaver.indexOf(c) != -1) {
                AntallBokstaver += 1;
            }
        }

        for (String i : array) {
            AntallOrd += 1;
        }

        double result = Math.round(AntallBokstaver / AntallOrd);
        return "Gjennomsnittlig ord lengde er: " + result;
    }

    public String AvrgOrdPerPeriode() {
        String[] periodeArray = text.split("[.!:?]+");
        int periode = 0;
        int ord = 0;

        for (String i : periodeArray) {
            periode += 1;
        }

        for (String i : array) {
            ord += 1;
        }

        double result = Math.round((double) ord / periode);
        return "gjennomsnittlig antall ord per periode: " + result +
                "\nantall ord: " +ord+ "\nantall perioder: "+periode;

    }


    public String ErstattOrd(String OldWord, String NewWord) {
        String NyTekst = text.replace(OldWord, NewWord);
        return NyTekst;
    }

    public String UpperCase() {
        return text.toUpperCase();
    }

    public String OriginalText() {
        return text;
    }
}
