package Oeving_6;

public class F3 {
    public static void main(String[] args) {
        // Lager en 2x3 matrise
        int[][] matrise1 = {
                {1, 2, 3},
                {4, 5, 6}};

        // Lager en annen 2x3 matrise for addisjon
        int[][] matrise2 = {
                {7, 8, 9},
                {10, 11, 12}};

        // Lager en 3x2 matrise for multiplikasjon
        int[][] matrise3 = {
                {1, 2},
                {3, 4},
                {5, 6}};

        // Oppretter Matrise-objekter
        Matrise original = new Matrise(matrise1);
        Matrise toAdd = new Matrise(matrise2);
        Matrise toMultiply = new Matrise(matrise3);

        // Skriver ut den originale matrisen
        System.out.print("Original matrise:");
        original.printMatrix();
        System.out.println();

        // Adderer matrisene
        int[][] addertArray = original.Addisjon(toAdd);
        Matrise addert = new Matrise(addertArray);

        // Skriver ut den adderte matrisen
        System.out.print("Addert matrise:");
        addert.printMatrix();
        System.out.println();

        // Multipliserer matrisene
        int[][] multiplisertArray = original.multiplikasjon(toMultiply);
        Matrise multiplisert = new Matrise(multiplisertArray);

        // Skriver ut den multipliserte matrisen
        System.out.print("Multiplisert matrise:");
        multiplisert.printMatrix();
        System.out.println();

        // Transponerer matrisen
        int[][] transponertArray = original.transponering();
        Matrise transponert = new Matrise(transponertArray);

        // Skriver ut den transponerte matrisen
        System.out.print("Transponert matrise:");
        transponert.printMatrix();
        System.out.println();
    }
}


