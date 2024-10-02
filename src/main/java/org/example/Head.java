package org.example;

import java.time.LocalDate;

public class Head extends Employee{

    public Head(String name, String middleName, String surname, String phoneNumber, int salary, LocalDate birthDate) {
        super(name, middleName,surname, phoneNumber, salary, birthDate);
        setPosition("Руководитель");
    }

    public static void raiseSalary(Employee[] employeesArray, int bonus, int age) {
        int newSalary = 0;
        for (int i = 0; i < employeesArray.length; i++) {
            if(employeesArray[i].getAge() > age && !(employeesArray[i] instanceof Head)) {
                newSalary = employeesArray[i].getSalary() + bonus;
                employeesArray[i].setSalary(newSalary);
            }
        }
    }
}
