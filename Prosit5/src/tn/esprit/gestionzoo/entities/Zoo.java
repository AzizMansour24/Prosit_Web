package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals = new Animal[25];
    private String name;
    private String city;
    private int nbrCages;
    int compteurAnimal=0;

    //constructeurs
    public Zoo(){}
    public Zoo(String name,String city,int nbrCages){
        animals =new Animal[nbrCages];
        this.setName(name);
        this.city=city;
        this.nbrCages=nbrCages;
    }
    //getters
    public int getNbrCages() {return nbrCages;}
    public String getCity() {return city;}
    public String getName() {return name;}
    public Animal[] getAnimals() {return animals;}
    //setters
    public void setNbrCages(int nbrCages) {this.nbrCages = nbrCages;}
    public void setCity(String city) {this.city = city;}
    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Nom du zoo invalide");
            this.name="tn.esprit.gestionzoo.entities.Zoo par defaut";
        } else {
            this.name = name;
        }
    }
    public void setAnimals(Animal[] animals) {this.animals = animals;}

    //Methodes
    public void DisplayZoo(){
        System.out.println("le nom du zoo:"+this.name+"\nla ville:"+this.city+"\nnombre de cages:"+this.nbrCages);
    }
    //instruction9
    public String toString() {
        return "le nom du zoo:"+this.name+"\nla ville:"+this.city+"\nnombre de cages:"+this.nbrCages;
    }

    public boolean addAnimal(Animal a){
        if(!isZooFull()){
            if(searchAnimal(a)==-1){
            animals[compteurAnimal]=a;
            compteurAnimal++;
            System.out.println("Ajout fait!!!!\n");
            return true;}
            else {
                System.out.println("deja existantt!!!\n");
                return false;
            }
        }
        else{
            System.out.println("Pas de cages disponibles!!!!\n");
            return false;
        }
    }

    public void displayAnimalsZoo(){
        if(compteurAnimal==0){
            System.out.println("tableau vide!!!!\n");
        }
        else {
            System.out.println(this.name+":");
            for (int i = 0; i < this.compteurAnimal; i++) {
                animals[i].DisplayAnimal();
            }
        }
    }

    int searchAnimal(Animal animal){
        for(int i=0;i<this.compteurAnimal;i++){
            if(animal.getName()==animals[i].getName()){
                System.out.println("tn.esprit.gestionzoo.entities.Animal trouvé!\n");
                return i;
            }
        }
        System.out.println("Introuvable!\n");
        return -1;
    }

    boolean removeAnimal(Animal animal){
        if(searchAnimal(animal)==-1){
            System.out.println("introuvable,echec de la supression!!!!\n");
            return false;
        }
        else {
            for(int i=searchAnimal(animal);i<this.compteurAnimal;i++){
                    animals[i]=animals[i+1];
            }
            animals[compteurAnimal-1]=null;
            compteurAnimal--;
            System.out.println("suppression faite!!");
            return true;
        }
    }

    boolean isZooFull(){
        if(compteurAnimal==this.nbrCages){
            System.out.println("tn.esprit.gestionzoo.entities.Zoo full!!!!\n");
            return true;
        }
        else {
            System.out.println("tn.esprit.gestionzoo.entities.Zoo not full!!!!\n");
            return false;
        }
    }

    Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.compteurAnimal > z2.compteurAnimal) {
            System.out.println("le premier zoo est plus grand\n");
            return z1;
        } else {
            System.out.println("le second zoo est plus grand\n");
            return z2;
        }
    }
}
