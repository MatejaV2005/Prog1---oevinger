package oeving_5_ny;
import java.util.*;

public class MinRandom {
    private int nedre;
    private int ovre;
    private Random r = new Random();

    MinRandom() {
        this.nedre = nedre;
        this.ovre = ovre;
    }

    public int NesteHeltall(int nedre, int ovre) {

        return r.nextInt(nedre, ovre + 1);
    }

    public double nesteDesimaltall(double nedre, double ovre) {
        return r.nextDouble(nedre + 0.0001, ovre);

    }
}
