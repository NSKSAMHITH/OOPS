class Car{
    int price;
    String make;
    String model;
    int topSpeed;


    public void carInfo(){
        System.out.println(this.price);
        System.out.println(this.model);
        System.out.println(this.make);
        System.out.println(this.topSpeed);
    }

    public void actionPerform(){
        System.out.println("vroom vroom");
    }

    //By default the constructor gets called
    Car(String make, String model){
        this.make = make;
        this.model = model;
        System.out.println("constructor created");
    }
}

public class ClassObjectExample {
    public static void main(String args[]){
        //object creation => here Car() is a constructor, used to create an object and the class and the constructor name is same and it doesn't have any return type.

        Car c1 = new Car("Honda", "Civic");

        //update values to the c1 object
        c1.make = "Acura";
        c1.model = "Integra";
        c1.price = 34000;
        c1.topSpeed = 200;
        c1.carInfo();

        Car c2 = new Car("Toyota", "Supra");
        //assigning values to the c2 object
        c2.price = 34000;
        c2.topSpeed = 200;



    }
}
