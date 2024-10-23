package lab4;

public class Square {
	Point A,B,C,D;
	
	public Square(Point A, Point B, Point C, Point D) {
		this.A = A;
		this.B = B;
		this.C = C;
        this.D = D;
	}
	
	public double getPerimeter() {
		return 4*D.distance(A);
	}

    public double getLength() {
		return A.distance(B);
	}

    public double getArea() {
        double side = A.distance(B);

        return side * side;
    }
	
	public boolean isSquare() {
        double sideAB = A.distance(B);
        double sideBC = B.distance(C);
        double sideCD = C.distance(D);
        double sideDA = D.distance(A);
        boolean isRightAngle = (isRightAngle(A, B, C));

        return ((sideAB == sideBC) && (sideBC == sideCD) && (sideCD == sideDA) && isRightAngle);
    }

    private boolean isRightAngle(Point A, Point B, Point C) {
        return ((A.x - B.x) * (C.x - B.x) + (A.y - B.y) * (C.y - B.y)) == 0; 
    }
}