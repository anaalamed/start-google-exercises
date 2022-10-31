package startAtGoogle.javaBestPracties.ch4_classesIntefaces.ex1_figure;

// Tagged class - vastly inferior to a class hierarchy! (Page 109)
 abstract class Figure {
    protected enum Shape { RECTANGLE, CIRCLE };

    // Tag field - the shape of this figure
    protected Shape shape;

    public Figure(Shape shape) {
        this.shape = shape;
    }

    protected double area() {
        return 0;
    }
}

 class Rectangle extends Figure{

    // These fields are used only if shape is RECTANGLE
    double length;
    double width;

    // Constructor for rectangle
    Rectangle(double length, double width) {
        super(Shape.RECTANGLE);
        this.length = length;
        this.width = width;
    }

     protected double area() {
         return length * width;
     }

}

 class Circle extends Figure {
    // This field is used only if shape is CIRCLE
    double radius;

    // Constructor for circle
    Circle(double radius) {
        super(Shape.CIRCLE);
        this.radius = radius;
    }

     protected double area() {
         return Math.PI * (radius * radius);
     }
}

class Main {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(2,3);
        Circle circle = new Circle(1);

        System.out.println("area rec = " + rec.area());
        System.out.println("area circle = " + circle.area());
    }
}