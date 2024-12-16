abstract class Animall{
    //add abstract keyword infront of method to make sure it is mandatorily used in all the classes that is inheriting animall class
    abstract void walk();

    //public method
    public void eats(){
        System.out.println("Eats");
    }

    Animall(){
        System.out.println("You are creating an animal");
    }
}

class Horse extends Animall{
    Horse(){
        System.out.println("Created a Horse");
    }
    @Override
    public void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animall{
    @Override
    public void walk() {
        System.out.println("walks on 2 legs");
    }
}

public class AbstractExample {
    public static void main(String[] args){
        Horse horse =  new Horse();
        horse.walk();
        horse.eats();
    }
}
