public class Animal{
    String family;
    String name;
    int age;
    boolean isMammal;
    public Animal(){}
    public Animal(String family, String name, int age, boolean isMammal){
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public void DisplayAnimal(){
        System.out.println("famille:"+family + "\nnom:" + name + "\nage:" + age + " \nisMammal:" + isMammal);
    }
    public String toString(){
        return "famille:"+family + "\nnom:" + name + "\nage:" + age + " \nisMammal:" + isMammal;
    }
}