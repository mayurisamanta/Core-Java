package com.vector.entity;

public class Developer extends Employee{


    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void calculateBonus() {
        System.out.println("Developer Bonus: " + this.getSalary() * 0.1);
    }
}
