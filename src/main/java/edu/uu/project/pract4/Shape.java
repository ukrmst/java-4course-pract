package edu.uu.project.pract4;

public interface Shape {
    double getArea();
    double getPerimeter();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new InvalidShapeException("Radius must be positive");
        } else {
            this.radius = radius;
        }
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
        //3.14 * r * r
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
        //2 * 3.14 * r
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new InvalidShapeException("Length or Width must be positive");
        } else  {
            this.length = length;
            this.width = width;
        }
    }

    @Override
    public double getArea() {
        return  length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }
}

class Triangle implements Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new InvalidShapeException("Sides must be greater than 0");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new InvalidShapeException("Triangle inequality is violated");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double s = (a + b + c) / 2.0;

        return Math.sqrt(
                s * (s - a) * (s - b) * (s - c)
        );
    }
    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}


// Rectangle та Triangle реалізуйте за тим самим принципом,
// з власними полями та коректними формулами площі й периметра
