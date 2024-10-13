package tn.esprit.gestionzoo.entities;

public class Terrestre extends Animal{
    protected int nbrLegs;
    public Terrestre() {
        System.out.println("Terrestre");
    }
    public Terrestre(String family, String name, int age,boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }
}
