package Oeving_4;
import java.util.Random;

public class Spiller {
    public int sumPoeng;

    public Spiller() {
        this.sumPoeng = 0;
    }

    public int getSumPoeng() {
        return sumPoeng;
    }

    public void kastTerning() {
        Terning terning = new Terning();
        int kast = terning.kastTerning();
        if (kast == 1) {
            sumPoeng = 0;
        }

        else if (sumPoeng > 30) {
            sumPoeng -= kast;
        }
        else {
            sumPoeng += kast;
        }
    }

    public boolean erFerdig() {
        return sumPoeng == 30;
    }
}














