package com.fine.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        //        Stream.of(1,2,3,4,5,6)
        //            .forEach(i -> System.out.println(i + " "));

        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        final List<Integer> result = new ArrayList<>();
        for (final Integer number : numbers) {
            if (number > 3 && number < 9) {
                final Integer newNumber = number * 2;
                result.add(newNumber);
            }
        }
        System.out.println("Result : " + result);

        System.out.println("Functional : " +
                numbers.stream()
                        .filter(number -> number > 3)
                        .filter(number -> number < 9)
                        .map(number -> number * 2)
                        .filter(number -> number > 10)
                        .findFirst()
                );
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> pridicate) {
        final List<T> result = new ArrayList<>();

        for (final T t : list) {
            if (pridicate.test(t)) {
                result.add(t);
            }
        }

        return result;
    }

    private static <T, R> List<R> map(List<T> list, Function<T,R> mapper) {

        final List<R> result = new ArrayList<>();
        for (final T t : list) {
            result.add(mapper.apply(t));
        }

        return result;

    }

}
