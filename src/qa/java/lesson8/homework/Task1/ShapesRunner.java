package qa.java.lesson8.homework.Task1;

import qa.java.lesson8.homework.Task1.Shapes.Circle;
import qa.java.lesson8.homework.Task1.Shapes.Rectangle;
import qa.java.lesson8.homework.Task1.Shapes.Shape;
import qa.java.lesson8.homework.Task1.Shapes.Triangle;

public class ShapesRunner {
    public static void main(String[] args) {
        Shape triangle = new Triangle(10, 10, 10);
        Shape rectangle = new Rectangle(15, 20);
        Shape circle = new Circle(15);
        Shape rectangleOne = new Rectangle(15, 20);
        Shape circleOne = new Circle(15);

        Shape[] shapesArray = new Shape[]{triangle, rectangle, circle, rectangleOne, circleOne};
        getSumOfPerimeter(shapesArray);
    }

    public static void getSumOfPerimeter(Shape[] array) {

        double sumOfPerimeter = 0;
        for (Shape shape : array) {
            sumOfPerimeter += shape.getPerimeter();
        }

        System.out.printf("The sum of the perimeters of the shapes in the array: %.1f", sumOfPerimeter);
    }
}
