package com.Skypro.Course_work.Increased_difficulty;

import com.Skypro.Course_work.Base_difficulty.Employee;

import java.util.ArrayList;


public class Main {
    public static final Employee[] sEmployees = new Employee[10];

    public static void main(String[] args) {

        sEmployees[0] = new Employee("Иванов", "Иван", "Иванович", 1, 65500.1065);
        sEmployees[1] = new Employee("Петров", "Петр", "Петрович", 4, 55500.5699);
        sEmployees[2] = new Employee("Сидоров", "Сидор", "Сидорович", 4, 57000.90);
        sEmployees[3] = new Employee("Олегов", "Олег", "Олегович", 5, 52600.40);
        sEmployees[4] = new Employee("Сергеев", "Сергей", "Сергеевич", 4, 59200.15);
        sEmployees[5] = new Employee("Александров", "Александр", "Александрович", 5, 48700.10);
        sEmployees[6] = new Employee("Эдуардов", "Эдуард", "Эдуардович", 3, 69400.90);
        sEmployees[7] = new Employee("Михаилов", "Михаил", "Михайлович", 3, 61300.70);
        sEmployees[8] = new Employee("Викторов", "Виктор", "Викторович", 1, 53000.50);
        sEmployees[9] = new Employee("Андреев", "Андрей", "Андреевич", 2, 59200.95);


    }

    public static void doIndexSalaryAllEmployees(Employee[] sEmployees, double index) {
        for (int i = 0; i < sEmployees.length; i++) {
            double result = (sEmployees[i].getEmployeeSalary() + sEmployees[i].getEmployeeSalary() * (index / 100));
            double scale = Math.pow(10, 2); // округление до сотых.
            sEmployees[i].setEmployeeSalary(Math.ceil(result * scale) / scale);
        }
    }

    public static void findMinimumEmployeeWageInDepartment(Employee[] sEmployees, int department) {
        ArrayList<Employee> asEmployee = new ArrayList<>();
        for (int i = 0; i < sEmployees.length; i++) {
            if (sEmployees[i].getEmployeeDivision() == department) {
                asEmployee.add(sEmployees[i]);
            }
        }
        double minSalary = asEmployee.get(0).getEmployeeSalary();
        for (int j = 0; j < asEmployee.size(); j++) {
            double minTemp = asEmployee.get(j).getEmployeeSalary();
            if (minTemp < minSalary) {
                minSalary = minTemp;
            }
        }
        for (int j = 0; j < asEmployee.size(); j++) {
            if (asEmployee.get(j).getEmployeeSalary() == minSalary) {
                System.out.println(asEmployee.get(j));
            }
        }
    }

    public static void findMaximumEmployeeWageInDepartment(Employee[] sEmployees, int department) {
        ArrayList<Employee> asEmployee = new ArrayList<>();
        for (int i = 0; i < sEmployees.length; i++) {
            if (sEmployees[i].getEmployeeDivision() == department) {
                asEmployee.add(sEmployees[i]);
            }
        }
        double maxSalary = asEmployee.get(0).getEmployeeSalary();
        for (int j = 0; j < asEmployee.size(); j++) {
            double maxTemp = asEmployee.get(j).getEmployeeSalary();
            if (maxTemp > maxSalary) {
                maxSalary = maxTemp;
            }
        }
        for (int j = 0; j < asEmployee.size(); j++) {
            if (asEmployee.get(j).getEmployeeSalary() == maxSalary) {
                System.out.println(asEmployee.get(j));
            }
        }
    }

    public static double findSumWageInDepartment(Employee[] sEmployees, int department) {
        ArrayList<Employee> asEmployee = new ArrayList<>();
        for (int i = 0; i < sEmployees.length; i++) {
            if (sEmployees[i].getEmployeeDivision() == department) {
                asEmployee.add(sEmployees[i]);
            }
        }
        double sum = 0;
        for (int j = 0; j < asEmployee.size(); j++) {
            sum += asEmployee.get(j).getEmployeeSalary();
        }
        return sum;
    }

    public static double findAverageWageInDepartment(Employee[] sEmployees, int department) {
        ArrayList<Employee> asEmployee = new ArrayList<>();
        for (int i = 0; i < sEmployees.length; i++) {
            if (sEmployees[i].getEmployeeDivision() == department) {
                asEmployee.add(sEmployees[i]);
            }
        }
        double sum = 0;
        for (int j = 0; j < asEmployee.size(); j++) {
            sum += asEmployee.get(j).getEmployeeSalary();
        }
        double averageValue = sum / asEmployee.size();
        double scale = Math.pow(10, 2); // округление до сотых.
        return Math.ceil(averageValue * scale) / scale;
    }

    public static void doIndexWageInDepartment(Employee[] sEmployees, int department, double index) {
        ArrayList<Employee> asEmployee = new ArrayList<>();
        for (int i = 0; i < sEmployees.length; i++) {
            if (sEmployees[i].getEmployeeDivision() == department) {
                asEmployee.add(sEmployees[i]);
            }
        }
        for (int j = 0; j < asEmployee.size(); j++) {
            double result = (asEmployee.get(j).getEmployeeSalary() + asEmployee.get(j).getEmployeeSalary() * (index / 100));
            double scale = Math.pow(10, 2); // округление до сотых.
            asEmployee.get(j).setEmployeeSalary(Math.ceil(result * scale) / scale);
        }

    }

    public static void printEmployeesInDepartment(Employee[] sEmployees, int department) {
        ArrayList<Employee> asEmployee = new ArrayList<>();
        for (int i = 0; i < sEmployees.length; i++) {
            if (sEmployees[i].getEmployeeDivision() == department) {
                asEmployee.add(sEmployees[i]);
            }
        }
        for (int j = 0; j < asEmployee.size(); j++) {
            System.out.println("ID " + asEmployee.get(j).getId() + ", Ф.И.О. " + asEmployee.get(j).getEmployeeLastName() + " " + asEmployee.get(j).getEmployeeLastName() + " " + asEmployee.get(j).getEmployeeMiddleName() + ", Зарплата: " + asEmployee.get(j).getEmployeeSalary());
        }
    }

    public static void printEmployeesWagesLessThan(Employee[] sEmployees, int than) {
        ArrayList<Employee> asEmployee = new ArrayList<>();
        for (int i = 0; i < sEmployees.length; i++) {
            if (sEmployees[i].getEmployeeSalary() <= than) {
                asEmployee.add(sEmployees[i]);
            }
        }
        for (int j = 0; j < asEmployee.size(); j++) {
            System.out.println("ID " + asEmployee.get(j).getId() + ", Ф.И.О. " + asEmployee.get(j).getEmployeeLastName() + " " + asEmployee.get(j).getEmployeeLastName() + " " + asEmployee.get(j).getEmployeeMiddleName() + ", Зарплата: " + asEmployee.get(j).getEmployeeSalary());
        }
    }

    public static void printEmployeesWagesGreaterThan(Employee[] sEmployees, int than) {
        ArrayList<Employee> asEmployee = new ArrayList<>();
        for (int i = 0; i < sEmployees.length; i++) {
            if (sEmployees[i].getEmployeeSalary() >= than) {
                asEmployee.add(sEmployees[i]);
            }
        }
        for (int j = 0; j < asEmployee.size(); j++) {
            System.out.println("ID " + asEmployee.get(j).getId() + ", Ф.И.О. " + asEmployee.get(j).getEmployeeLastName() + " " + asEmployee.get(j).getEmployeeLastName() + " " + asEmployee.get(j).getEmployeeMiddleName() + ", Зарплата: " + asEmployee.get(j).getEmployeeSalary());
        }
    }


}
