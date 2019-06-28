package com.fine.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.zip.Checksum;

public class Java2 {

    public static void main(String[] args) {

        List<Dish> menu = Arrays.asList(
                new Dish("pork", false, 800, Dish.Type.MEAT),
                new Dish("beef", false, 700, Dish.Type.MEAT),
                new Dish("chicken", false, 400, Dish.Type.FISH),
                new Dish("french fries", true, 530, Dish.Type.OTHER),
                new Dish("rice", true, 360, Dish.Type.OTHER),
                new Dish("season fruit ", true, 120, Dish.Type.OTHER),
                new Dish("pizza", true, 550, Dish.Type.OTHER),
                new Dish("prawns", false, 300, Dish.Type.FISH),
                new Dish("salmon", false, 450, Dish.Type.FISH)
        );


        List<Dish> vegList =
                menu.stream()
                    .filter(Dish::isVegetarian)
                    .collect(Collectors.toList());
/*
        List<String> threeHighCaloriDN =
                menu.stream()
                    .filter(
                            d-> {
                                System.out.println("filtering : " + d.getName());
                                return d.getCalories() > 300;
                            })
                    .map(d -> {
                        System.out.println("mapping : " + d.getName());
                        return d.getName();
                    })
                    .limit(3)
                    .collect(Collectors.toList());

        System.out.println(threeHighCaloriDN);*/


    }


}
