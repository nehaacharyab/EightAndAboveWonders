package main;

import model.Employee;
import model.Person;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * Predicate / BiPredicate Example
 * Predicate is a functional interface which represents a predicate (boolean-valued function) of one argument.
* BiPredicate is a functional interface which represents a predicate (boolean-valued function) of two arguments.
 */
public class PredicateExample {


    public static void main(String[] args) {
        var employee = new Employee("John", 30, "USA");

        Predicate<Employee> agePredicate = e -> e.getAge() > 18;
        Predicate<Employee> countryPredicate = e -> e.getCountry().equalsIgnoreCase("India");

        var gt18 = testEmployee(employee, agePredicate);
        System.out.println("Employee GT 18: " + gt18);

        var fromIndia = testEmployee(employee, countryPredicate);
        System.out.println("Employee is from India " + fromIndia);

        /** Predicate chaining AND **/
        var fromIndiaAndGT18 = countryPredicate.and(agePredicate).test(employee);
        System.out.println("Employee is from India and GT 18: " + fromIndiaAndGT18);

        /** Predicate chaining OR **/
        var fromIndiaORGT18 = countryPredicate.or(agePredicate).test(employee);
        System.out.println("Employee is from India or GT 18: " + fromIndiaORGT18);

        /** Predicate chaining NEGATE **/
        var fromIndiaAndGT18Negate = countryPredicate.and(agePredicate).negate().test(employee); // Predicate chaining (Negate operation on two predicates)
        System.out.println("Employee is from India or GT 18 - Negate : " + fromIndiaAndGT18Negate);

        /** Tests if two arguments are equal according to Objects.equals(Object, Object). This is not a chaining method. **/
        Predicate<String> predicate  = Predicate.isEqual("Hello");
        System.out.println(predicate.test("Welcome"));

        /** BiPredicate Example
         * If we want to take any input as parameter for comparison and not hardcode it, we can use a BiPredicate instead of Predicate.
         * **/
        var person = new Person("John", 30);
        var isPersonEligibleToVote = testPersonVotingEligibility(person, (p, age) -> p.getAge() > age, 18);
        System.out.println("Is person eligible to vote: " + isPersonEligibleToVote);
    }

    static boolean testEmployee(Employee employee, Predicate<Employee> predicate) {
        return predicate.test(employee);
    }

    static boolean testPersonVotingEligibility(Person person, BiPredicate<Person, Integer> predicate, Integer age) {
        return predicate.test(person, age);
    }
}
