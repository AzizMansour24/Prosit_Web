package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal{
    protected String habitat;
    public Aquatic(){
        //pas besoin d'utiliser super() dans le constructeur par defaut
        System.out.println("Aquatic");
    }
    public Aquatic(String family, String name, int age,boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

}

