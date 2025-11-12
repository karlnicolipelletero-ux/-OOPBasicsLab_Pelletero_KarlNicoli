package karllab8;

public class Circle {

    // 1. attribute
    private double radius;

    // constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // 2. methods
    // getarea(): calculates the area (π * r^2)
    public double getArea() {
        // Math.PI is a built-in Java constant for π
        // Math.pow(this.radius, 2) means radius squared
        return Math.PI * Math.pow(this.radius, 2);
    }

    // getcircumference(): Calculates circumference (2 * π * r)
    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    // displayDetails(): Prints all the circle's information
    public void displayDetails() {
        System.out.println("--- Circle Details ---");
        System.out.println("Radius: " + this.radius);

        // Call the other methods to get the computed values
        System.out.println("Area: " + getArea());
        System.out.println("Circumference: " + getCircumference());
    }

    // Optional: Getters and Setters for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }
}
