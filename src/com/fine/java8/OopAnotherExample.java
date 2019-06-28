package com.fine.java8;

import java.util.List;
import java.util.function.Predicate;

public class OopAnotherExample {

    public static void main(String[] args) {
        final CalculatorService calculatorService = new CalculatorService();
        final int result = calculatorService.calculate(1, 1);
        System.out.println(result);
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> filter) {
        return null;
    }


}

class CalculatorService{

    public int calculate(int num1, int num2) {
        return num1 + num2;
    }

}



