package Oeving_6;

public class Matrise {
    private final int[][] matrise; // En 2D-array som representerer matrisen, første [] = rows, andre [] = columns

    // Konstruktør som tar inn en 2D-array
    public Matrise(int[][] matrise) {
        this.matrise = matrise;
    }

    public int[][] Addisjon(Matrise other) throws IllegalArgumentException {
        // KODE FOR Å SJEKKE OM DIMENSJONENE TIL DE TO MATRISENE ER SAMME!!!
        if (this.matrise.length != other.matrise.length || this.matrise[0].length != other.matrise[0].length) {
            throw new IllegalArgumentException("Matrisene er ikke av samme dimensjon");
        }

        int[][] result = new int[this.matrise.length][this.matrise[0].length];

        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[i].length; j++) {
                result[i][j] = this.matrise[i][j] + other.matrise[i][j];
            }
        }
        return result;
    }


    public int[][] multiplikasjon(Matrise other) throws IllegalArgumentException {
        if (this.matrise[0].length != other.matrise.length) {
            throw new IllegalArgumentException("matrisene er ikke av riktige dimensjoner");
        }

        int[][] multiplisert = new int[this.matrise.length][other.matrise[0].length];

        for (int i = 0; i < this.matrise.length; i++) {
            for (int j = 0; j < other.matrise[0].length; j++ ) {
                for (int k = 0; k < this.matrise[0].length; k++) {
                    multiplisert[i][j] += this.matrise[i][k] * other.matrise[k][j];
                }
            }
        }
        return multiplisert;
    }

    public int[][] transponering() {
        int[][] transponert = new int[this.matrise[0].length][this.matrise.length];
        for (int i = 0; i < this.matrise.length; i++) {
            for (int j = 0; j < this.matrise[0].length; j++) {
                transponert[j][i] = this.matrise[i][j];
            }
        }
        return transponert;
    }

    public void printMatrix() {
        for (int i = 0; i < matrise.length; i++) {
            System.out.println();
            for (int j = 0; j < matrise[i].length; j++) {
                System.out.print(matrise[i][j] + " ");
            }
        }
    }
}
