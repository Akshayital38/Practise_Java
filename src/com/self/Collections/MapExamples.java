package com.self.Collections;

import java.util.*;


public class MapExamples {
    public static void main(String args[]) {

        Map<String, Integer> name = new TreeMap<>();


        name.put("al", 30);
        name.put("key2", 50);
        name.put("aa", 60);
        name.put("null", 80);

        Map<String, Integer> name1 = new HashMap<>();

        name1.put("a1", 30);
        name1.put("key2", 50);
        name1.put("aa", 60);
        name1.put("null", 80);

        System.out.println(name);
        System.out.println(name.containsKey("null"));
        System.out.println(name1);


    }
}
