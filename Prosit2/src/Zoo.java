public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo(){}

    public Zoo(String name,String city,int nbrCages){
        animals =new Animal[nbrCages];
        this.name=name;
        this.city=city;
        this.nbrCages=nbrCages;
    }

    public void DisplayZoo(){
        System.out.println("le nom du zoo:"+this.name+"\nla ville:"+this.city+"\nnombre de cages:"+this.nbrCages);
    }
    
    //instruction9
    public String toString() {
        return "le nom du zoo:"+this.name+"\nla ville:"+this.city+"\nnombre de cages:"+this.nbrCages;
    }

}
