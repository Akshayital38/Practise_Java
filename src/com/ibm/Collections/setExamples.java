package com.ibm.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class setExamples {

    public static void main(String args[]) {

        Set<Integer> s1 = new TreeSet<>();
        Set<Integer> s2 = new HashSet<>();

        s1.add(3);
        s1.add(12);
        s1.add(23);
        s1.add(34);
        s1.add(3);

        s2.add(3);
        s2.add(12);
        s2.add(23);
        s2.add(34);
        s2.add(3);

        System.out.println(s1.size());
        System.out.println(s1);
        System.out.println(s2);

        Iterator<Integer> val = s1.iterator();

        while(val.hasNext()){
            System.out.println(val.next());
        }
    }
}
