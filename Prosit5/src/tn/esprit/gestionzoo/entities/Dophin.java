package tn.esprit.gestionzoo.entities;

public class Dophin extends Aquatic{
    protected float swimmingSpeed;
    public Dophin() {
        System.out.println("Dophin");
    }
    public Dophin(String family, String name, int age,boolean isMammal, String habitat,float swimmingSpeed){
        super(family,name, age,isMammal,habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
}
