package karllab8;

public class Vehicle {

    // 2. define attributes
    String brand;
    String model;
    double speed;

    // 3. add the constructor
    public Vehicle(String brand, String model, double speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    // 4. add the accelerate() method
    public void accelerate(double increment) {
        this.speed += increment; // This adds the increment to the current speed
        System.out.println(this.brand + " " + this.model + " is accelerating to " + this.speed + " km/h.");
    }

    // 5. add the displayStatus() method
    public void displayStatus() {
        System.out.println("--- Vehicle Status ---");
        System.out.println("  Brand: " + this.brand);
        System.out.println("  Model: " + this.model);
        System.out.println("  Current Speed: " + this.speed + " km/h");
    }
}
