public class Circle {

    // Variables
    private double radius;
    private String colour;
    private double area;

    // Constructor
    public Circle(double radius, String colour) {
        setRadius(radius);
        setColour(colour);
    }

    // Getters and Setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        area = Math.pow(radius, 2) * Math.PI;   // Area of circle calculation
        this.radius = radius;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getArea() {
        return area;
    }
}
