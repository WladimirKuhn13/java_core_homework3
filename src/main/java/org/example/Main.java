package org.example;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Вася", "Васильевич", "Васин", "Рабочий", "89999999999", 45000, LocalDate.of(1975, 2, 13));
        Employee employee1 = new Employee("Петя", "петрович", "Петров", "Рабочий", "89998888888", 50000, LocalDate.of(1985, 3, 22));
        Employee employee2 = new Employee("Сидр", "Сидорович", "Сидоров", "Рабочий", "89997777777", 45000, LocalDate.of(1995, 4, 20));
        Employee employee3 = new Employee("Иван", "Иванович", "Иванов", "Рабочий", "89996666666", 47000, LocalDate.of(1960, 8, 11));
        Employee employee4 = new Employee("Вова", "Владимирович", "Владимиров", "Рабочий", "89995555555", 45000, LocalDate.of(1966, 1, 18));
        Employee head = new Head("Вася", "Васильевич", "Васин", "89999999999", 100000, LocalDate.of(1975, 2, 13));

        Employee[] employeesArray = {employee, employee1, employee2, employee3, employee4, head};
//        System.out.println(head.getClass().getSimpleName());
        //head.getAllInfoAboutEmployee();

        System.out.println("До повышения");
        for (int i = 0; i < employeesArray.length; i++) {
            employeesArray[i].getAllInfoAboutEmployee();
        }

//        raiseSalary(employeesArray);
//        raiseSalary(employeesArray, 5000, 40);
//        Employee.raiseSalary(employeesArray, 5000 , 40);
        Head.raiseSalary(employeesArray, 5000 , 40);
        System.out.println("После повышения");
        for (int i = 0; i < employeesArray.length; i++) {
            employeesArray[i].getAllInfoAboutEmployee();
        }
    }

    public static void raiseSalary(Employee[] employeesArray) {
        int bonus = 5000;
        int newSalary = 0;
        for (int i = 0; i < employeesArray.length; i++) {
            if (employeesArray[i].getAge() > 45) {
                newSalary = bonus + employeesArray[i].getSalary();
                employeesArray[i].setSalary(newSalary);
            }
        }
    }

    public static void raiseSalary(Employee[] employeesArray, int bonus, int age) {
        int newSalary = 0;
        for (int i = 0; i < employeesArray.length; i++) {
            if(employeesArray[i].getAge() > age) {
                newSalary = employeesArray[i].getSalary() + bonus;
                employeesArray[i].setSalary(newSalary);
            }
        }
    }

}