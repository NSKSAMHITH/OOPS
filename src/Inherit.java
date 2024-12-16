class Shape{
    String color;

}

//Inheritance
//class triangle inherits shape (Triangle: Child class, Shape: Base class/Parent class), helps in resuability
//Single
class Triangle extends Shape{

}

public class Inherit {
    public static void main(String[] args){
        Triangle t1 = new Triangle();
        t1.color = "red";
    }
}
