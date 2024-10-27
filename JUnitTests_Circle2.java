package lab4;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTests_Circle2 {
	
	@Test
	public void testConstructor1() {
		Point center = new Point(1, 3);
		Circle circle = new Circle(center, 5);
		assertTrue(circle.radius == 5.0, "Circle radius should be intialized to 5.0.");
	}
	
	
	
	@Test
	public void testConstructor2() {
		Point center = new Point(1, 3);
		Circle circle = new Circle(center, 5);
		assertEquals(circle.center, center, "Circle center should be intialized to Point (1, 3).");
	}
	
	
	
    @Test
    public void testArea() {
        Point center = new Point(1, 3);
        Circle circle = new Circle(center, 0);
        assertEquals(0, circle.area(), 0.001, "circle.area() should return 0.");
    }

    @Test
    public void testCircumference() {
        Point center = new Point(1, 3);
        Circle circle = new Circle(center, 0);
        assertEquals(0, circle.circumference(), 0.001, "circle.circumference should return 0.");
    }

    @Test
    public void testMoveCenter() {
        Point center = new Point(1, 3);
        Circle circle = new Circle(center, 0);
        circle.moveCenter(2, 6);
        assertEquals(new Point(2, 6), circle.center, "circle.center should be (2, 6).");
    }

    @Test
    public void testIsCircle() {
        Circle circle = new Circle(new Point(1, 3), 0.1);
        assertTrue(circle.isCircle(), "Circle with radius 0.1 should be valid.");
    }
    
    @Test
    public void testIsCircle2() {
        Circle circle = new Circle(new Point(1, 3), 0);
        assertFalse(circle.isCircle(), "Circle with radius 0 should be invalid.");
    }
    
    @Test
    public void testIsCircle2() {
        Circle circle = new Circle(new Point(1, 3), -0.1);
        assertFalse(circle.isCircle(), "Circle with negative radius should be invalid.");
    }

    @Test
    public void testIsContained() {
        Circle circle = new Circle(new Point(1, 3), 0);
        Point insidePoint = new Point(1, 3);
        Point outsidePoint = new Point(1.01, 3);

        assertTrue(circle.isContained(insidePoint), "Point (1, 3) should be inside the circle.");
        assertFalse(circle.isContained(outsidePoint), "Point (1.01, 3) should be outside the circle.");
    }
    
    
    
    
}



