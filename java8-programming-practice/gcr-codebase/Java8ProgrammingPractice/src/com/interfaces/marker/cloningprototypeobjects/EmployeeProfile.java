package com.interfaces.marker.cloningprototypeobjects;

public class EmployeeProfile implements Prototype, Cloneable {

    private String empId;
    private String name;
    private int experience;

    public EmployeeProfile(String empId, String name, int experience) {
        this.empId = empId;
        this.name = name;
        this.experience = experience;
    }

    @Override
    public Object getClone() {
        try {
            return this.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Employee cloning not supported");
            return null;
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return empId + " " + name + " " + experience;
    }
}
