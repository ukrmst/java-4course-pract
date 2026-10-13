package edu.uu.project.pract4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TriangleTest {

    @Test
    void shouldCalculateAreaForValidSides() throws InvalidShapeException {
        Triangle triangle = new Triangle(6, 6, 6);

        double s = (6 + 6 + 6) / 2.0;
        double expected = Math.sqrt(
                s * (s - 6) * (s - 6) * (s - 6)
        );

        double actual = triangle.getArea();

        assertEquals(expected, actual, 0.001);
    }

    @Test
    void shouldCalculatePerimeterForValidSides() throws InvalidShapeException {
        Triangle triangle = new Triangle(6, 6, 6);

        double expected = 6 + 6 + 6;
        double actual = triangle.getPerimeter();

        assertEquals(expected, actual, 0.001);
    }

    @Test
    void shouldThrowExceptionForInvalidSides() {
        assertThrows(
                InvalidShapeException.class,
                () -> new Triangle(0, 4, 6)
        );
    }
}
