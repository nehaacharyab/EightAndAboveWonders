package main;

import model.Person;

import java.util.function.Supplier;
import java.util.function.Predicate;
import java.util.function.IntSupplier;
import java.util.function.DoubleSupplier;

public class SupplierExample {
    public static void main(String[] args) {

        Supplier<Person> personSupplier = () -> new Person("John", 30);
        Predicate<Person> predicate = p -> p.getAge() > 18;
        boolean isPersonEligibleForVoting = predicate.test(personSupplier.get());
        System.out.println("Is person eligible for voting: " + isPersonEligibleForVoting);

        /** IntSupplier **/
        IntSupplier intSupplier = () -> 0;
        System.out.println(intSupplier.getAsInt());

        /** DoubleSupplier **/
        DoubleSupplier doubleSupplier = () -> 0;
        System.out.println(doubleSupplier.getAsDouble());

    }
}
