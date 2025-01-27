package com.self.lambdaClass;


interface ZeroParameter {
    void display();
}
public class lambdaClass {
    public static void main(String[] args)
    {
        // Lambda expression with zero parameters
        ZeroParameter zeroParamLambda = () -> System.out.println("This is a zero-parameter lambda expression!");

        // Invoke the method
        zeroParamLambda.display();
        String name = new String("Akshay");
        System.out.println(name.hashCode());
        System.out.println(name.equals("name"));
        System.out.println(name.charAt(5));

    }
}
