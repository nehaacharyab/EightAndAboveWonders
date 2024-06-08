package main;

import model.Employee;
import service.EmployeeService;

import java.util.Arrays;

public class EmployeeMain {

    public static void main(String[] args) {
        var employees = Arrays.asList(
                new Employee("John", 30, "USA"),
                new Employee("Martin", 25, "India"),
                new Employee("Sam", 35, "USA"),
                new Employee("Raj", 28, "India")
        );
        System.out.println("Sorting using lambda expression");
        EmployeeService.getAllPersons(employees).forEach(System.out::println);

        System.out.println("\nSorting using anonymous class");
        EmployeeService.getAllPersonsAnonymousClass(employees).forEach(System.out::println);
    }
}
