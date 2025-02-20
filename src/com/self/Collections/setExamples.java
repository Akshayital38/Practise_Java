package com.self.Collections;

import java.util.*;

public class setExamples {

    public static void main(String args[]) {

//        Set<Integer> s1 = new TreeSet<>();
//        Set<Integer> s2 = new HashSet<>();
//
//        s1.add(3);
//        s1.add(12);
//        s1.add(23);
//        s1.add(34);
//        s1.add(3);
//
//        s2.add(3);
//        s2.add(12);
//        s2.add(23);
//        s2.add(34);
//        s2.add(3);
//
//        System.out.println(s1.size());
//        System.out.println(s1);
//        System.out.println(s2);
//
//        Iterator<Integer> val = s1.iterator();
//
//        while(val.hasNext()){
//            System.out.println(val.next());
//        }

        int[] arr ={1,2,3,21,3,2};
        List<Integer> list = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5);

        Set<Integer> val1 = new HashSet<>();
        for(int a:arr){
            val1.add(a);
        }

        Arrays.stream(arr).distinct().forEach(System.out::print);
        System.out.println(val1);

    }
}
