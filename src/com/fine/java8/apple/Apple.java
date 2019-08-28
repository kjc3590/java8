package com.fine.java8.apple;

import com.fine.java8.Person;
import com.fine.java8.apple.predicate.ApplePredicate;
import com.fine.java8.apple.predicate.AppleRedAndHeavyPredicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Apple {


    private String color;
    private Integer weight;

    public String getColor() {
        return color;
    }

    public Integer getWeight() {
        return weight;
    }

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    


}
