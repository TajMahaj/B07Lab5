package lab4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    @Test
    public void testArea() {
        Point center = new Point(0, 0);
        Circle circle = new Circle(center, 2);
        assertEquals(Math.PI * 4, circle.area(), 0.001, "Area calculation failed.");
    }

    @Test
    public void testCircumference() {
        Point center = new Point(0, 0);
        Circle circle = new Circle(center, 3);
        assertEquals(2 * Math.PI * 3, circle.circumference(), 0.001, "Circumference calculation failed.");
    }

    @Test
    public void testMoveCenter() {
        Point center = new Point(1, 1);
        Circle circle = new Circle(center, 5);
        circle.moveCenter(3, 4);
        assertEquals(new Point(3, 4), circle.center, "Circle center move failed.");
    }

    @Test
    public void testIsCircle() {
        Circle circle = new Circle(new Point(0, 0), 1);
        assertTrue(circle.isCircle(), "Circle with positive radius should be valid.");

        Circle invalidCircle = new Circle(new Point(0, 0), -1);
        assertFalse(invalidCircle.isCircle(), "Circle with negative radius should not be valid.");
    }

    @Test
    public void testIsContained() {
        Circle circle = new Circle(new Point(0, 0), 2);
        Point insidePoint = new Point(1, 1);
        Point outsidePoint = new Point(3, 3);

        assertTrue(circle.isContained(insidePoint), "Point should be inside the circle.");
        assertFalse(circle.isContained(outsidePoint), "Point should be outside the circle.");
    }
}