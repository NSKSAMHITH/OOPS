class Company{
 String name = "Amazon";

 public void printCompanyName(){
     System.out.println("Company name: " + name);
 }
}

class Employee extends Company{

}

public class SingleInheritExample {
    public static void main(String[] args){

        Employee e1 = new Employee();
        e1.name = "Samhith";

        System.out.println(e1.name);
        e1.printCompanyName();
    }
}
