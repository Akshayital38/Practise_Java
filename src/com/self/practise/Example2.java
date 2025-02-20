package com.self.practise;

import java.util.*;
import java.util.stream.Collectors;


public class Example2 {
    public static void main(String[] args) {
//        ArrayList<Integer> val = new ArrayList<>();
//        val.add(12);
//        val.add(10);
//        val.add(32);
//
//
//        List<Integer> res = val.stream().sorted().toList();
//        List<Integer> res1 = val.stream().sorted().toList();
//
//        Optional<Integer> min = val.stream().min(Comparator.naturalOrder());
//        Optional<Integer> max = val.stream().max(Comparator.naturalOrder());
//
//        min.ifPresent(vale -> System.out.println(vale));
//        max.ifPresent(vale -> System.out.println(vale));

        List<Integer> list = Arrays.asList( 3,11, 12, 2, 5);
        Integer res2 = list.stream().min(Integer::compare).get();

            System.out.println(res2);

        Integer res3 = list.stream().max(Integer::compare).get();

        System.out.println(res3);
    }
}
