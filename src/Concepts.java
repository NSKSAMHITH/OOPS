class Pen{
    //Properties
    String color;
    String type;//ballpen or gelpen

    public void write(){
        System.out.println("write operation");
    }

    public void printColor(){
        System.out.println(this.color);
    }

    public void printType(){
        System.out.println(this.type);
    }
}

class Student{
    String name;
    int age;
    int rollNo;

    public void printName(){
        System.out.println(this.name);
    }

    public void printInfo(){
        System.out.println(this.age);
        System.out.println(this.rollNo);
    }
}

public class Concepts {
    public static void main(String[] args){
        //Objects and classes
        //Classes => Blueprint(all the things that can be performed)
        //Objects => Objects used to perform those actions

        //object created in main function
        Pen pen1 = new Pen();

        //Adding or modifying properties
        pen1.color = "blue";
        pen1.type = "gelPen";

        //object creation
        Pen pen2 = new Pen();

        //assigning properties to that object
        pen2.color = "green";
        pen2.type = "ballPen";

        //Access the method inside the class, we need to use object and using dot operator call the method
        pen1.write();
        pen1.printColor();
        pen1.printType();

        //calling methods
        pen2.printColor();
        pen2.printType();

        Student s1 = new Student();

        s1.name = "samhith";
        s1.age = 28;
        s1.rollNo = 44;

        s1.printName();
        s1.printInfo();
    }
}
