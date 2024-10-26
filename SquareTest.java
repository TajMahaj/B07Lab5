package lab4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {

    @Test
    public void testSquarePerimeter() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 2);
        Point C = new Point(2, 2);
        Point D = new Point(2, 0);

        Square square = new Square(A, B, C, D);
        assertEquals(8, square.getPerimeter());
    }

    @Test
    public void testSquareLength() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 3);
        Point C = new Point(3, 3);
        Point D = new Point(3, 0);

        Square square = new Square(A, B, C, D);
        assertEquals(3, square.getLength());
    }

    @Test
    public void testSquareArea() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 4);
        Point C = new Point(4, 4);
        Point D = new Point(4, 0);

        Square square = new Square(A, B, C, D);
        assertEquals(16, square.getArea());
    }

    @Test
    public void testIsSquareTrue() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 5);
        Point C = new Point(5, 5);
        Point D = new Point(5, 0);

        Square square = new Square(A, B, C, D);
        assertTrue(square.isSquare());
    }

    @Test
    public void testIsSquareFalse() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 5);
        Point C = new Point(3, 5);
        Point D = new Point(3, 0);

        Square square = new Square(A, B, C, D);
        assertFalse(square.isSquare());
    }

    @Test
    public void testNonRightAngleShape() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 3);
        Point C = new Point(2, 5);
        Point D = new Point(2, 0);

        Square square = new Square(A, B, C, D);
        assertFalse(square.isSquare());
    }
}
