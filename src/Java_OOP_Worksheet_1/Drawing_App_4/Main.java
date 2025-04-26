package Java_OOP_Worksheet_1.Drawing_App_4;

public class Main {
    public static void main(String[] args) {
        // Create an array of Shape objects, including different shape types
        Shape[] shapes = new Shape[4];

        // Instantiate Circle, Square, and Triangle
        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Triangle();
        shapes[3] = new Circle();//shapes[3] = shapes[0];

        // Loop through the shapes array and call draw() for each shape
        for (Shape shape : shapes) {
            shape.draw();  // Polymorphism in action!
        }
    }
}
