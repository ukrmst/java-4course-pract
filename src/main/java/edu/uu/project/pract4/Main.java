package edu.uu.project.pract4;

public class Main {
    public static void main(String[] args) {
        //Shape circle = new Circle(0);
//        System.out.println("Circle area: " + circle.getArea());
//        System.out.println("Circle perimeter: " + circle.getPerimeter());
        try {
            Shape circle = new Circle(0);
        } catch (InvalidShapeException e) {
            System.out.println(e.getMessage());
        }

        try {
            Shape rectangle = new Rectangle(0, 0);
        } catch (InvalidShapeException e) {
            System.out.println(e.getMessage());
        }

        try {
            Shape triangle = new Triangle(0, 0, 0);
        }  catch (InvalidShapeException e) {
            System.out.println(e.getMessage());
        }


//        Shape rectangle = new Rectangle(5, 5);
//        System.out.println("Rectangle area: " + rectangle.getArea());
//        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
//
//        Shape triangle = new Triangle(2.5, 7, 4);
//        System.out.println("Triangle area: " + triangle.getArea());
//        System.out.println("Triangle perimeter: " + triangle.getPerimeter());
    }
}
