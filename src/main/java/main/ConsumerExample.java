package main;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        // Consumer to display a string
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello World");

        // Consumer to display a integer
        Consumer<Integer> intConsumer = i -> System.out.println("This is a integer "+i);
        intConsumer.accept(10);

        // Consumer to display a string with multiple statements
        Consumer<String> consumerName = s -> System.out.println("Hello, I am John");
        Consumer<String> consumerAge = s -> System.out.println("I am 30 years old");
        Consumer<String> consumerCountry = s -> System.out.println("I am from USA");
        consumerName.andThen(consumerAge).andThen(consumerCountry).accept("Hello");

        // BiConsumer to display two strings
        BiConsumer<String, String> biConsumer = (s1, s2) -> System.out.println(s1 + " " + s2);
        biConsumer.accept("Hello", "World");
    }
}
