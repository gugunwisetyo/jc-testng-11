package com.juaracoding;

public class User {
    private String name;
    private boolean isActive;
    private double salary;

    // Constructor
    public User(String name, boolean isActive, double salary) {
        this.name = name;
        this.isActive = isActive;
        this.salary = salary;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for isActive
    public boolean isActive() {
        return isActive;
    }

    // Setter for isActive
    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to display user information
    public void displayUserInfo() {
        System.out.println("Name: " + name);
        System.out.println("Account Active: " + isActive);
        System.out.println("Salary: $" + salary);
    }

    public static void main(String[] args) {
        // Create a User object
        User user1 = new User("John Doe", true, 50000.0);

        // Display user information
        user1.displayUserInfo();

        // Update user information
        user1.setName("Jane Smith");
        user1.setActive(false);
        user1.setSalary(60000.0);

        // Display updated user information
        System.out.println("\nUpdated User Information:");
        user1.displayUserInfo();
    }
}
