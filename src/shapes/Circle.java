package shapes;

public class Circle extends Shape {
    private double rad;

    public Circle(String colorHex, boolean isFilled, double rad) {
        super(colorHex, isFilled);
        this.rad = rad;
    }

    @Override
    public double getArea() { 
        return Math.PI * Math.pow(rad, 2); 
    }

    @Override
    public double getPerimeter() { 
        return 2.0 * Math.PI * rad; 
    }

    @Override
    public String toString() {
        return String.format("[ Circle ]\n%s\nRadius: %.1f\nArea         : %.2f\nCircumference: %.2f", 
                super.toString(), rad, getArea(), getPerimeter());
    }

    public double getRadius() { return rad; }
}
