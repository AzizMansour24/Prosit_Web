package tn.esprit.gestionzoo.entities;

public class Animal{
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    //constructeurs
    public Animal(){}
    public Animal(String family, String name, int age, boolean isMammal){
        this.family = family;
        this.name = name;
        this.setAge(age);       //pour verifier si l'age est negatif
        this.isMammal = isMammal;
    }
    //setters
    public void setAge(int age) {
        if(age<0){
            System.out.println("Age invalid ,automatiquement mis à 0");
            this.age = 0;
        }else {
            this.age = age;
        }
    }
    public void setFamily(String family) {this.family = family;}
    public void setName(String name) {this.name = name;}
    public void setMammal(boolean mammal) {isMammal = mammal;}
    //getters
    public int getAge() {return age;}
    public String getFamily() {return family;}
    public String getName() {return name;}
    public boolean isMammal() {return isMammal;}
    //Methodes
    public void DisplayAnimal(){
        System.out.println("\nfamille:"+family + "  nom:" + name + "  age:" + age + "  isMammal:" + isMammal);
    }
    public String toString(){
        return "\nfamille:"+family + "  nom:" + name + "  age:" + age + " isMammal:" + isMammal;
    }
}