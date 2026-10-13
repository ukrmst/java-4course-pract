package edu.uu.project.pract4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class IntegrationTest {
    @Test
    void integrationTest() throws InvalidShapeException {
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(5, 6, 5);
        Rectangle rectangle = new Rectangle(2, 9);

// Circle
        assertEquals(Math.PI * 5 * 5, circle.getArea(), 0.001);
        assertEquals(2 * Math.PI * 5, circle.getPerimeter(), 0.001);

// Triangle
        assertEquals(12.0, triangle.getArea(), 0.001);
        assertEquals(5 + 6 + 5, triangle.getPerimeter(), 0.001);

// Rectangle
        assertEquals(2 * 9, rectangle.getArea(), 0.001);
        assertEquals(2 * (2 + 9), rectangle.getPerimeter(), 0.001);

        assertThrows(
                InvalidShapeException.class,
                () -> new Circle(-2)
        );
        assertThrows(
                InvalidShapeException.class,
                () -> new Triangle(1, 2, 5)
        );
        assertThrows(
                InvalidShapeException.class,
                () -> new Rectangle(-7, 9)
        );
    }
}
