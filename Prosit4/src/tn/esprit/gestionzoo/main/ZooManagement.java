package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
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
        animal1.setAge(9);
        animal1.setFamily("lion");
        animal1.setMammal(true);
        animal1.setName("midou");
        zoo1.setCity("ezzahra");
        zoo1.setName("belvedere");
        zoo1.setNbrCages(50);

        //instruction7
        Animal animal2= new Animal("tigre","titi",-1,false);    //essayer de mettre un age negatif
        Zoo zoo2=new Zoo("","ariana",63);                               //essayer de mettre un nom vide


        zoo2.addAnimal(animal1);
        zoo2.addAnimal(animal2);
        zoo2.displayAnimalsZoo();
    }
}
