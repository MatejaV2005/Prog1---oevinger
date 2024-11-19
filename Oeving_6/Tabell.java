package Oeving_6;

public class Tabell {
    java.util.Random rand;

    public Tabell() {
        this.rand = new java.util.Random();
    }

    public int Tall() {
        return rand.nextInt(10);
    }

    public int[] tabell() {
        // lager en array-liste med 10 mulige plasser for tall. array lsiten settes med base verdier 0, på alle 10 plassene
        return new int[10];
    }
}








