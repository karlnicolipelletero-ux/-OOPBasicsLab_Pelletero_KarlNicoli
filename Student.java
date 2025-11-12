/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karllab8;

//1. Create Student Class
public class Student {

    //2. attributes of a student
    private String name;
    private int age;
    private double grade;

    //3. Contructor
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    //4. Display thingy
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age " + age);
        System.out.println("Grade " + grade);

    }

    //modification of number 2 from activity 1, where I added get and set
    //getter for the name
    public String getName() {
        return this.name;
    }

    //setter for the name
    public void setName(String Name) {
        this.name = name;
    }

    //Getter for age 
    public int getAge() {
        return this.age;
    }

    //setter for the age
    public void setAge(int age) {
        if (age > 0);
        this.age = age;
    }

    //getter for grade 
    public double getGrade() {
        return this.grade;
    }

    //setter for the grade
    public void setGrade(double grade) {
        this.grade = grade;
    }

}
