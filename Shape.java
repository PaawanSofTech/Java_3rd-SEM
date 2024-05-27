import java.util.*;

class Shape {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        circle.inputRadius();
        rectangle.inputWidthAndHeight();

        circle.displayArea();
        rectangle.displayArea();
    }
}

class Circle {
    double radius;

    void inputRadius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = scanner.nextDouble();
    }
    
    void displayArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }
}

class Rectangle {
    float Width, Height;

    void inputWidthAndHeight(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        Width = scanner.nextFloat();
        System.out.print("Enter the height of the rectangle: ");
        Height = scanner.nextFloat();
    }

    void displayArea(){
        float area = Width * Height;
        System.out.println("Area of the rectangle: " + area);
    }
}