package com.ibm.lambdaClass;

import java.util.ArrayList;

public class lambdaClassOneParameter {

    public static void main(String args[]) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        // Using lambda expression to print all elements
        // of arrL

        System.out.println("Elements of the ArrayList : ");

        arrayList.forEach(n -> System.out.println(n));

        // Using lambda expression to print even elements
        // of arrL

        System.out.println("Even Elements of the ArrayList : ");

        arrayList.forEach((Integer n) -> {   // optional to gave data type of n
            if (n%2 == 0){
                System.out.println(n);
            }
        });
    }

}
