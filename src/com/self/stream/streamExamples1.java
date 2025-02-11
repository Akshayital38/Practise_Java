package com.self.stream;

import java.util.stream.IntStream;

public class streamExamples1 {
    public static void main(String[] args) {

    IntStream.range(1,10).filter(i -> {
        System.out.print("1");
        return i%2 == 0;
    }).filter(i -> {
        System.out.print("0");
        return i > 3;
    }).limit(1)
            .forEach(i -> {
                System.out.print(i);
            });

        IntStream.of(1,1,3,3,7,6,7)
                .distinct()
                .parallel()
                .map( i -> i*2)
                .sequential()
                .forEach(System.out::print);
    }
}
