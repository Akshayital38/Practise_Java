package com.self.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class streamExamples {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> result = names.stream()
                .filter(name -> name.startsWith("B"))
                .toList();
        result.forEach(System.out::println);
        System.out.println(false);


        //  practise examples
        int[] nums ={3,2,2,3};
        List<Integer> res = new ArrayList<>();
        int val =3;
        for(int i =0; i<nums.length; i++){
            if(nums[i] != val ){
                res.add(nums[i]);
            }
        }
        System.out.println(res.size());
        String container ="";
        for (int i=0;i<container.length();i++) {
            container.charAt(0);

        }
    }
}
