package shapes;

public abstract class Shape {
    private String colorHex;
    private boolean isFilled;

    public Shape(String colorHex, boolean isFilled) {
        this.colorHex = colorHex;
        this.isFilled = isFilled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Color : " + colorHex + "\nFilled: " + (isFilled ? "Yes" : "No");
    }

    public String getColor() { return colorHex; }
    public boolean isFilled() { return isFilled; }
    public void setColor(String c) { this.colorHex = c; }
    public void setFilled(boolean f) { this.isFilled = f; }
}
