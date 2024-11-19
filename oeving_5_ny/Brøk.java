package oeving_5_ny;

public class Brøk {
    private int teller;
    private int nevner;

    Brøk(int teller, int nevner) throws IllegalArgumentException {
        if (nevner == 0) {
            throw new IllegalArgumentException("ERROR: Nevner kan ikke være 0");
        }
        this.teller = teller;
        this.nevner = nevner;
    }


    int getTeller() {

        return teller;
    }

    int getNevner() {

        return nevner;
    }

    Brøk addisjon(Brøk annenBrøk) {
        int nyTeller = (this.getTeller() * annenBrøk.getNevner()) + (annenBrøk.getTeller() * this.getNevner());
        int nyNevner = this.getNevner() * annenBrøk.getNevner();
        return new Brøk(nyTeller, nyNevner);
    }

    Brøk subtrahering(Brøk annenBrøk) {
        int nyTeller = (this.getTeller() * annenBrøk.getNevner()) - (annenBrøk.getTeller() * this.getNevner());
        int nyNevner = this.getNevner() * annenBrøk.getNevner();
        return new Brøk(nyTeller, nyNevner);
    }

    Brøk multiplikasjon(Brøk annenBrøk) {
        int nyTeller = this.getTeller() * annenBrøk.getTeller();
        int nyNevner = this.getNevner() * annenBrøk.getNevner();
        return new Brøk(nyTeller, nyNevner);
    }

    Brøk divisjon(Brøk annenBrøk) {
        int nyTeller = this.getTeller() * annenBrøk.getNevner();
        int nyNevner = this.getNevner() * annenBrøk.getTeller();
        return new Brøk(nyTeller, nyNevner);
    }

    @Override
    public String toString() {
        return teller + "/" + nevner;
    }
}