import java.util.Scanner;

public class ZooManagement {
    int nbrCages ;
    String zooName;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        ZooManagement zoo = new ZooManagement();


        System.out.println("Entrez le nom du zooz:\n");
        zoo.zooName=scanner2.nextLine();
        System.out.println("Entrez le nombre de cages:\n");
        while(!scanner2.hasNextInt()){
            System.out.println("il faut entrer un entier!!");
            scanner2.next();
            System.out.println("Entrez le nombre de cages:\n");
        }
        zoo.nbrCages= scanner2.nextInt();
        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages");

    }
}
