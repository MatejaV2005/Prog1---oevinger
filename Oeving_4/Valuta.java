package Oeving_4;

public class Valuta {
    public double belop;

    Valuta() {

    }

    double NOKtilUSD(double belop) {

        return belop * 0.095;
    }


    double NOKtilEUR(double belop) {

        return belop * 0.086;
    }


    double NOKtilSEK(double belop) {

        return belop * 0.97;
    }

    double USDtilNOK(double belop) {

        return belop / 0.095;
    }


    double EURtilNOK(double belop) {

        return belop / 0.086;
    }


    double SEKtilNOK(double belop) {

        return belop / 0.97;
    }


}

