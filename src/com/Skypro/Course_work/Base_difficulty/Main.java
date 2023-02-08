package com.Skypro.Course_work.Base_difficulty;


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


    public static void printAllInfoEmployees(Employee[] sEmployees) {
        int i = 0;
        do {
            System.out.println(sEmployees[i]);
            i++;
        } while (i < 10);
    }

    public static double receiveSumSalaryEmployees(Employee[] sEmployees) {
        double sum = 0;
        for (int i = 0; i < sEmployees.length; i++) {
            Employee emp = sEmployees[i];
            sum = sum + emp.getEmployeeSalary();
        }
        double scale = Math.pow(10, 2); // округление до сотых.
        return Math.ceil(sum * scale) / scale;
    }

    public static double receiveMinSalaryEmployees(Employee[] sEmployees) {
        double minSalary = sEmployees[0].getEmployeeSalary();
        for (Employee sEmployee : sEmployees) {
            double minTemp = sEmployee.getEmployeeSalary();
            if (minTemp < minSalary) minSalary = minTemp;
        }
        return minSalary;

    }

    public static double receiveMaxSalaryEmployees(Employee[] sEmployees) {
        double maxSalary = sEmployees[0].getEmployeeSalary();
        for (int i = 0; i < sEmployees.length; i++) {
            double maxTemp = sEmployees[i].getEmployeeSalary();
            if (maxTemp > maxSalary) maxSalary = maxTemp;
        }
        return maxSalary;
    }

    public static double receiveAverageValueSalary(Employee[] sEmployees) {
        double averageValue = receiveSumSalaryEmployees(sEmployees) / sEmployees.length;
        double scale = Math.pow(10, 2); // округление до сотых.
        return Math.ceil(averageValue * scale) / scale;
    }

    public static void printFullNameEmployees(Employee[] sEmployees) {
        for (int i = 0; i < sEmployees.length; i++) {
            System.out.println(sEmployees[i].getEmployeeFistName() + " "
                    + sEmployees[i].getEmployeeMiddleName() + " "
                    + sEmployees[i].getEmployeeLastName() + " ");
        }
    }

}