package com.vector.entity;

public class Manager extends Employee{


    public Manager(String name, double salary) {
        super(name, salary);

    }

    @Override
    public void calculateBonus() {
        System.out.println("Manager Bonus: " + this.getSalary() * 0.15);
    }

}
