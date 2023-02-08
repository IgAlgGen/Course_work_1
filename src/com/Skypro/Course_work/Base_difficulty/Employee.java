package com.Skypro.Course_work.Base_difficulty;


public class Employee {
    private final String employeeFistName;
    private final String employeeLastName;
    private final String employeeMiddleName;
    private int employeeDivision;
    private double employeeSalary;
    private static int idCounter = 1;
    private final int id = idCounter;

    public Employee(String employeeLastName, String employeeFistName, String employeeMiddleName, int employeeDivision, double employeeSalary) {
        this.employeeFistName = employeeFistName;
        this.employeeLastName = employeeLastName;
        this.employeeMiddleName = employeeMiddleName;
        this.employeeDivision = employeeDivision;
        double scale = Math.pow(10, 2); // округление employeeSalary до сотых.
        this.employeeSalary = Math.ceil(employeeSalary * scale) / scale;
        idCounter++;

    }

    @Override
    public String toString() {
        return "ID " + id +
                ", Ф.И.О. " + employeeLastName +
                " " + employeeFistName +
                " " + employeeMiddleName +
                ", Отдел " + employeeDivision +
                ", Зарплата: " + employeeSalary;

    }

    public String getEmployeeFistName() {
        return employeeFistName;
    }

    public String getEmployeeLastName() {
        return employeeLastName;
    }

    public String getEmployeeMiddleName() {
        return employeeMiddleName;
    }

    public int getEmployeeDivision() {
        return employeeDivision;
    }

    public void setEmployeeDivision(int employeeDivision) {
        this.employeeDivision = employeeDivision;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public int getId() {
        return id;
    }


}