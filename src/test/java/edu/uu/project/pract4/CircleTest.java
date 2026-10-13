package edu.uu.project.pract4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CircleTest {

    @Test
    void shouldCalculateAreaForValidRadius() throws InvalidShapeException {
        Circle circle = new Circle(5);

        double expected = Math.PI * 5 * 5;
        double actual = circle.getArea();

        assertEquals(expected, actual, 0.001);
    }

    @Test
    void shouldCalculatePerimeterForValidRadius() throws InvalidShapeException {
        Circle circle = new Circle(5);

        double expected = 2 * Math.PI * 5;
        double actual = circle.getPerimeter();

        assertEquals(expected, actual, 0.001);
    }

    @Test
    void shouldThrowExceptionForNegativeRadius() {
        assertThrows(
                InvalidShapeException.class,
                () -> new Circle(-5)
        );
    }
}