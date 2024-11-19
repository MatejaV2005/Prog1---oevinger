package oeving_2;
public class B2 {
    public static void main(String[] args) {
        double KjottA = 35.90;
        double KjottB = 39.40;

        double A_per_Gram = KjottA / 450;
        double B_per_Gram = KjottB / 500;

        if (A_per_Gram < B_per_Gram) {
            System.out.printf("kjøtt A er billigere, med en pris på %.2f per gram", A_per_Gram);
        }
        else {
            System.out.printf("kjøtt B er billigere, med en pris på %.2f per gram", B_per_Gram);
        }
    }
}

