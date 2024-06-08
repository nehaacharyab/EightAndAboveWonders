package main;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        // Function to find the length of a string
        Function<String, Integer> functionExample = s -> s.length();
        System.out.println(functionExample.apply("Hello World"));

        // Function to multiply the input by 10
        Function<Integer, Integer> mulFunction = i -> i * 10;
        System.out.println(mulFunction.apply(5));

        // Function to add 1 to the input
        Function<Integer, Integer> addFunction = i -> i + 1;
        System.out.println(addFunction.apply(5));

        // Chaining multiple functions
        System.out.println(mulFunction.andThen(addFunction).apply(5));

        // BiFunction to add two numbers
        BiFunction<Integer, Integer, Integer> niFunction = (a, b) -> a + b;
        System.out.println(niFunction.apply(10, 20));
    }
}
