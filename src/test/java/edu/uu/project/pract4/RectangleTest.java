package edu.uu.project.pract4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {

    @Test
    void shouldCalculateAreaForValidSides() throws InvalidShapeException {
        Rectangle rectangle = new Rectangle(5, 9);

        double expected = 5 * 9;
        double actual = rectangle.getArea();

        assertEquals(expected, actual, 0.001);
    }

    @Test
    void shouldCalculatePerimiterForValidSides() throws InvalidShapeException {
        Rectangle rectangle = new Rectangle(5, 9);

        double expected = 2 * (5 + 9);
        double actual = rectangle.getPerimeter();

        assertEquals(expected, actual, 0.001);
    }

    @Test
    void shouldThrowExceptionForInvalidSides() {
        assertThrows(
                InvalidShapeException.class,
                () -> new Rectangle(-7, 9)
        );
    }
}
