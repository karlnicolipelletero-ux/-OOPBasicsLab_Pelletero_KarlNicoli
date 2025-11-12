package karllab8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Activity 1 and 2 Problem  
        System.out.println("Problem 1 and 2");
        //create a student object
        Student student1 = new Student("Karl Gwapo Kaayo", 20, 92.5);
        Student student2 = new Student("Cj Gwapo kaayo pero mas gwapo ko", 22, 88.0);

        //Display Output
        System.out.println("---initial info---");
        student1.displayInfo();

        //used setters to modify or update data
        System.out.println("\n... Updating student's grade and age...\n");
        student1.setGrade(95.0);
        student1.setAge(21);

        //used getters to display the data(modification of activity 2)
        System.out.println("--- Updated Information ---");
        System.out.println("Name: " + student1.getName()); // Using getter
        System.out.println("Age: " + student1.getAge());     // Using getter
        System.out.println("Grade: " + student1.getGrade()); // Using getter

        //---Activity 3---
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Problem 3");

        Vehicle car = new Vehicle("Toyota", "Camry", 60.0);
        Vehicle motorcycle = new Vehicle("Honda", "CBR500R", 80.0);

        // Display the new status after acceleration
        System.out.println("\n=== FINAL STATUS ===");
        car.displayStatus();
        motorcycle.displayStatus();

        //---Activity 4---
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Problem 4");
        BankAccount myAccount = new BankAccount("Test User", 0.0);

        // Print the header
        System.out.println("Bank Account:");

        // Simulate the transactions directly
        myAccount.deposit(1000.0);
        myAccount.withdraw(200.0);

        // Display the final balance
        myAccount.displayBalance();

        //---Activity 5---
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Problem 5");

        // 3. Create two circle objects with different radii
        Circle smallCircle = new Circle(5.0);
        Circle largeCircle = new Circle(12.5);

        // display their computed values
        // displayDetails() method will print all the info 
        smallCircle.displayDetails();

        System.out.println();

        largeCircle.displayDetails();
    }
}
