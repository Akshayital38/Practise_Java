package com.self.dateFeatures;

import java.time.LocalDate;
import java.util.function.BiFunction;

public class dateExamples {
    public static void main(String[] args) {
        LocalDate.now().plusDays(5);

        BiFunction<String ,String,Boolean> compare = (x,y) -> x.equals(y);
        System.out.println(compare.apply("Java8","java8"));
    }


}