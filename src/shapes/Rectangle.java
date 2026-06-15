package shapes;

public class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    public Rectangle(String colorHex, boolean isFilled, double sideA, double sideB) {
        super(colorHex, isFilled);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() { 
        return sideA * sideB; 
    }

    @Override
    public double getPerimeter() { 
        return 2.0 * (sideA + sideB); 
    }

    @Override
    public String toString() {
        return String.format("[ Rectangle ]\n%s\nWidth : %.1f\nLength: %.1f\nArea      : %.2f\nPerimeter : %.2f", 
                super.toString(), sideA, sideB, getArea(), getPerimeter());
    }

    public double getWidth() { return sideA; }
    public double getLength() { return sideB; }
}
