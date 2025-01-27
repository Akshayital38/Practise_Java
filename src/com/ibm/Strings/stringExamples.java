package com.ibm.Strings;

public class stringExamples {

    public static void main(String args[]) {

        String name = "value";
        String name1 = new String("value");

        System.out.println( name);
        System.out.println( name1);

        System.out.println( name == name);
        System.out.println( name1 == name1);
        System.out.println( name == name1);

        System.out.println( name.equals(name));
        System.out.println( name1.equals(name1));
        System.out.println( name.equals(name1));

        // Java Program to demonstrate Explicitly assigned strings

        String val = "Sachin";
        val = val.concat(" Tendulkar");
        System.out.println(val);

    }

}
