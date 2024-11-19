package Oeving_4;
import java.util.*;

class Terning {
    private static Random random;

    public Terning() {
        random = new Random();
    }

    public int kastTerning() {
        return random.nextInt(6) + 1;
    }
}
