package tn.esprit.gestionzoo.entities;

public class Pinguin extends Aquatic{
    protected float swimmingDepth;
    public Pinguin() {
        System.out.println("Pinguin");
    }
    public Pinguin(String family, String name, int age,boolean isMammal, String habitat,float swimmingDepth){
        super(family,name, age,isMammal,habitat);
        this.swimmingDepth = swimmingDepth;
    }
}
