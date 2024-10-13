import java.util.Scanner;
public class ZooManagement {
    int nbrCages ;
    String zooName;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        ZooManagement zooManage = new ZooManagement();


        System.out.println("Entrez le nom du zooz:\n");
        zooManage.zooName=scanner.nextLine();
        System.out.println("Entrez le nombre de cages:\n");
        while(!scanner2.hasNextInt()){
            System.out.println("il faut entrer un entier!!");
            scanner2.next();
            System.out.println("Entrez le nombre de cages:\n");
        }
        zooManage.nbrCages= scanner2.nextInt();
        System.out.println(zooManage.zooName + " comporte " + zooManage.nbrCages + " cages");


        //Prosit2
        Animal animal1= new Animal();
        Zoo zoo1= new Zoo();
        animal1.age=9;
        animal1.family="lion";
        animal1.isMammal=true;
        animal1.name="midou";
        zoo1.city="ezzahra";
        zoo1.name="belvedere";
        zoo1.nbrCages=50;

        //instruction7
        Animal animal2= new Animal("tigre","titi",4,false);
        Zoo zoo2=new Zoo("esprit","ariana",63);

        //instruction8
        zoo2.DisplayZoo();
        System.out.println(zoo2);               //message incomprehensible
        System.out.println(zoo2.toString());    //message incomprehensible

        //instruction 9
        animal2.DisplayAnimal();
        System.out.println(animal2.toString());

    }
}
