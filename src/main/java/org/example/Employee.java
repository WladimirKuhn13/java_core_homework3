package org.example;

import java.time.LocalDate;
import java.util.Comparator;

public class Employee {

    private String name;
    private String middleName;
    private String surname;
    private String position;
    private String phoneNumber;
    private int salary;
    private LocalDate birthDate;

    public Employee(String name, String middleName, String surname, String position, String phoneNumber, int salary, LocalDate birthDate) {
        this.name = name;
        this. middleName = middleName;
        this.surname = surname;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    public Employee(String name, String middleName, String surname, String phoneNumber, int salary, LocalDate birthDate) {
        this.name = name;
        this. middleName = middleName;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSurname() {
        return surname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getAge() {
        int age = LocalDate.now().getYear() - birthDate.getYear();
        return age;
    }

    public void getAllInfoAboutEmployee() {
        System.out.println("Имя сотрудника: " + name + '\'' +
                            ", Отчество сотрудника: " + middleName +
                            ", Фамилия сотрудника: " + surname +
                            ", Должность сотрудника: " + position +
                            ", Телефон сотрудника: " + phoneNumber +
                            ", Зарплата сотрудника: " + salary +
                            ", Возраст сотрудника: " + getAge() );
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

    Comparator<Employee> comparator = new Comparator<Employee>() {
        public int compare(Employee e1, Employee e2) {
            return e1.getBirthDate().compareTo(e2.getBirthDate());
        }
    };
}
