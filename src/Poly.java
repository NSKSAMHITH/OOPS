class Studdent{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(int age, String name){
        System.out.println(name + " " + age);
    }

}
public class Poly {
    public static void main(String[] args){
        //object creation
        Studdent st1 = new Studdent();

        //assign values to the object
        st1.name = "Capri-corn";
        st1.age = 19;

        //Polymorphism by passing values
        st1.printInfo("qwerty");
        st1.printInfo(25);
        st1.printInfo(123, "asdfghjk");

        //Polymorphism by passing parameters
        st1.printInfo(st1.name);
        st1.printInfo(st1.age);
        st1.printInfo(st1.age, st1.name);
    }
}
