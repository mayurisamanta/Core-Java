package com.vector.entity;

public class Employee {

    private String name;

    private double salary;

    public void calculateBonus() {
        System.out.println("Employee Bonus: " + this.getSalary() * 0.05);
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("A", 1000);
        employee.calculateBonus();

        Employee developer = new Developer("B", 2000);
        developer.calculateBonus();

        Employee manager = new Manager("C", 3000);
        manager.calculateBonus();
    }
}
