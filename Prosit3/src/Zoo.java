public class Zoo {
    Animal[] animals = new Animal[25];
    String name;
    String city;
    int nbrCages;
    int compteurAnimal=0;

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

    public boolean addAnimal(Animal a){
        if(this.compteurAnimal<this.nbrCages){
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
            for (int i = 0; i < this.compteurAnimal; i++) {
                animals[i].DisplayAnimal();
            }
        }
    }
    int searchAnimal(Animal animal){
        for(int i=0;i<this.compteurAnimal;i++){
            if(animal.name==animals[i].name){
                System.out.println("Animal trouvé!\n");
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
            System.out.println("Zoo full!!!!\n");
            return true;
        }
        else {
            System.out.println("Zoo not full!!!!\n");
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
