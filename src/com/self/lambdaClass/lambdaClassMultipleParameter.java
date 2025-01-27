package com.self.lambdaClass;

interface Functional {
    int operation(int a, int b);
}

public class lambdaClassMultipleParameter {

    public static void main(String args[]) {

        //Using lambda expressions to define the operations

        Functional add = (a,b) -> a+b ;
        Functional multiply = (a,b) -> a*b ;

        System.out.println(add.operation(2,3));
        System.out.println(multiply.operation(4,5));

    }
}
