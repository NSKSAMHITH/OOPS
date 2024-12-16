interface AnimalPark{
    public void walker();
}

interface Herbivore{
    public void foods();
}

class Bear implements AnimalPark, Herbivore{
    public void walker(){
        System.out.println("walks on 4 legs");
    }

    public void foods(){
        System.out.println("Bear eats grass and millets");
    }
}

public class InterfaceExample {
    public static void main(String[] args){
        Bear bear = new Bear();
        bear.walker();

        bear.foods();

    }
}
