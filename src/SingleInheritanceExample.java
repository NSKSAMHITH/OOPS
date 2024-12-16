class Shapes{
    public void printArea(){
        System.out.println("Displays area");
    }
}

class Trianglee extends Shapes{
    public void printArea(double l, double b){
        double area;
        area = (0.5 * l * b);
        System.out.println(area);
    }
}

class EquilateralTriangle extends Trianglee{
    public void printArea(double l, double b){
        System.out.println(0.5*l*b);
    }
}
public class SingleInheritanceExample {
    public static void main(String[] args){
        Trianglee th1 = new Trianglee();
        th1.printArea();
        th1.printArea(8, 9);

        EquilateralTriangle eq1 = new EquilateralTriangle();
        eq1.printArea(8,5);
    }
}
