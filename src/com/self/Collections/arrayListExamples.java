package com.self.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class arrayListExamples {

    public static void main(String args[]) {
        ArrayList<String> al = new ArrayList<>();

        List<Integer> val = new ArrayList<>();
        val.add(1);
        val.add(100);
        val.add(43);
        val.add(123);
        val.add(0);
        // 1. Addition

        // Adding elements to ArrayList
        // at the end


        al.add("hello");
        al.add("akshay");


        System.out.println("Orignal List : "+al);

        // Adding Elements at the specific index

        al.add(1, "For");

        System.out.println("Modifies List : "+al);

        // 2. Deletion of Element

        // Removing Element using index
        al.remove(0);

        System.out.println("Element removed from index  : "+al);

        // Removing Element using the value
        al.remove("For");

        System.out.println("Element For removed : "+ al);

        // 3. Updating Values

        // Updating value at index 0
        al.set(0, "GFG");

        System.out.println("List after updation :" + al);


        System.out.println(al.indexOf("GFG"));



        Collections.sort(val);

        System.out.println(val);


        // comparator

        Comparator<Integer> com = new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        };



    }
}
