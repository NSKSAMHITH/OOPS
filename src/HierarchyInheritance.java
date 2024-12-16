import bank.Account;

class Breeds{
    String name;

    public void printBreedName(String name){
        System.out.println(name);
    }
}

class Animal extends Breeds{
    public void sound(){
        System.out.println("woof");
    }
}

class Cat extends Breeds{
    public void sound(){
        System.out.println("Meow!");
    }
    public void catFood(){
        System.out.println("Fish or Tuna");
    }
}

public class HierarchyInheritance {
    public static void main(String[] args){
        Animal a1  = new Animal();
        a1.printBreedName("St. Bernard");
        a1.sound();

        //c1 => new object of class Cat
        Cat c1 =  new Cat();
        c1.printBreedName("British short hair");
        c1.sound();
        c1.catFood();

        bank.Account account1 = new bank.Account();
        account1.name = "Samhith";
    }
}
