package service;

import model.Employee;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/** EmployeeService class to sort the list of employees based on their name */
public class EmployeeService {
    /**
     * Using lambda expression
     * @param employees List of employees
     * @return List of employees sorted based on their name
     */
    public static List<Employee> getAllPersons(List<Employee> employees){
        Collections.sort(employees, (emp1, emp2)-> emp1.getName().compareTo(emp2.getName()));
        return employees;
    }

    /**
     * Using Anonymous class
     * @param employees List of employees
     * @return List of employees sorted based on their name
     */
    public static List<Employee> getAllPersonsAnonymousClass(List<Employee> employees){
        Collections.sort(employees, new Comparator<Employee>(){
            public int compare(Employee emp1, Employee emp2){
                return emp1.getName().compareTo(emp2.getName());
            }
        });
        return employees;
    }
}
