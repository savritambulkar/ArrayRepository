 
class NegativeValueExp extends RuntimeException {
    NegativeValueExp(String args) {
    super(args);
    }
    }
    class Shape {
    void area(int val) {
    System.out.println("Area of Circle ");
    }
    void area(int val1, int val2) {
    System.out.println("Area of Reactangle");
    }
    }
    class Circle extends Shape {
    void area(int val) {
    try {
    if (val > 0) {
    double sum = Math.PI * val * val;
    System.out.println(sum);
    } else {
    throw new NegativeValueExp("The value is Neagtive : Circle");
    
    }
    } catch (Exception e) {
    System.out.println(e);
    }
    }
    }
    class Reactangle extends Shape {
    void area(int val1, int val2) {
    try {
    if (val1 > 0 && val2 > 0) {
    int sum = val1 * val2;
    System.out.println(sum);
    } else {
    throw new NegativeValueExp("The value is Neagtive : Reactangle");
    }
    } catch (Exception e) {
    System.out.println(e);
    e.printStackTrace();
    }
    }
    }
    class Assment16 {
    public static void main(String[] args) {
    Circle ob1 = new Circle();
    Reactangle ob2 = new Reactangle();
    ob1.area(20);
    ob2.area(-20, 40);
}
    }