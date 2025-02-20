package com.self.stream;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class streamPractice {

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,6,54,7,4,3,2,6,12);

        System.out.println("Printing the list in ascending sorted order");
        list.stream().sorted().toList().forEach(j -> System.out.print(" "+j));

        System.out.println();

        System.out.println("Printing the list in descending sorted order");
        list.stream().sorted(Comparator.reverseOrder()).toList().forEach(j -> System.out.print(" "+j));

        System.out.println();

        System.out.println("Printing all the distinct even number from the list");
        // Print all the even numbers from the list
        list.stream().filter(x -> x%2==0).distinct().forEach(m -> System.out.print(" "+m));

        System.out.println();

        System.out.println("Printing the distinct numbers in list");
        list.stream().distinct().forEach(j -> System.out.print(" "+j));

        System.out.println();

        System.out.println("Print the maximum number of the list");
        System.out.println(list.stream().mapToInt(Integer::intValue).reduce(0,(a, b) -> Math.max(a, b)));

        System.out.println("Printing the minimum number of the list");
        System.out.println(list.stream().min(Integer::compare).get());

        System.out.println("way to find both min & max in a single go");
        IntSummaryStatistics k = list.stream().collect(Collectors.summarizingInt(Integer::intValue));

        System.out.println("the max value of the list is = "+k.getMax()+" and the min value is = "+k.getMin());

        int m[] = {1,2,3,4,5,6,7,8,9};
        List<Integer> tmp = Arrays.stream(m).boxed().collect(Collectors.toList());
        Collections.reverse(tmp);
        System.out.println(tmp);

        //Finding the sum of all the values of list using stream and printing it
        System.out.println(" the sum of values are = "+list.stream().mapToInt(Integer::valueOf).sum());

        String s = "Item 1 10 something random 20 brother it is 15";
        // find the sum of values of integers in the String and print it
        System.out.println(" the sum of integers of the string = \""+s+"\" is = "+
                Arrays.stream(s.split(" ")).filter( t -> t.matches("\\d+")).
                        mapToInt(Integer::valueOf).sum());

        System.out.println("Print all the values that duplicate in the list");
        // Print all the duplicate values of the list
        list.stream().filter(e -> Collections.frequency(list,e) > 1).collect(Collectors.toSet()).forEach(System.out::println);

        System.out.println("Print all the non duplicate values in the list");
        // Print all the duplicate values of the list
        list.stream().filter(e -> Collections.frequency(list,e) == 1).collect(Collectors.toSet()).forEach(System.out::println);

        // finding the maximum length word and print it using stream
        System.out.println(" Printing the largest length word from the previous string = "+
                Arrays.stream(s.split(" ")).reduce("",(w1,w2) -> w1.length()>w2.length() ? w1 : w2));


        // Remove the duplicates from the String , or print without the duplicates
        String z = "Abbaaz is a very good booy";

        Arrays.stream(z.split("")).distinct().forEach(System.out::print);

        System.out.println();

        // finding the nth repeating element in a string
        int n = 2;
        Set<String> oset =  Arrays.stream(s.split("")).filter(e -> Collections.frequency(List.of(s.split("")),e) > 1).collect(Collectors.toSet());
        List<String> tmpListA = new ArrayList<>(oset);
        System.out.println(tmpListA.get(n));

        // rotating array question
        /*
        eg 1,2,3,4,5 -> if k - 1 then it becomes 5,1,2,3,4 -> if k = 2 , then it becomes 4,5,1,2,3
        ->how to break a singleton pattern
        ->executor service
        -> concurrent hash map and hash map difference
        -> use of application context
        -> Component is a managed spring bean ***
        -> about Web Client
        -> five key achitechture , read about grant , roles , scope , clientId , clientSecret
        -> JWT token , O-Auth 2, JWT structure, JWT claims , difference between JWT and O-auth
        -> spring profile
        -> service discovery ,rate limiters,  circuit breaker , Eureka server
        -> how to reduce the time for executing your application , how to scale up application , scale tolerence
        ->

        -> read about kubernetes , docker and kafka in details -> architechture , how to handle internally
        -> trick question print 1 to 5 without using loops
         */
    }
}
