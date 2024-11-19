package Oeving_7;
import java.util.ArrayList;
import java.util.List;

public final class NyString {
    private String stringobjekt;
    private String[] array;

    NyString(String stringobjekt){
        this.stringobjekt = stringobjekt;
        this.array = stringobjekt.split("\\s+");
    }

    public List<String> Forkorting(){;

        List<String> result = new ArrayList<>();

        for (String i : array) {
            String førstebokstav = String.valueOf(i.charAt(0));
            result.add(førstebokstav);
        }

    return result;
    }


    public String Fjerning(char bokstav) {
        String result = "";

        for (char i : stringobjekt.toLowerCase().toCharArray()) {
            if (i != bokstav) {
                result += i;
            }
        }
        return result;
    }
}


