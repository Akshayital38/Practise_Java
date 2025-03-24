package com.self.practise;

import java.util.*;
import java.util.stream.Collectors;


public class Example2 {


    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) {
        // Write your code here.
        int n = arr.size()/3;
        ArrayList<Integer> res = new ArrayList<>();
        Map<Integer, Integer> val = new HashMap<Integer,Integer>();
        for(int i :arr){
            Integer j = val.get(i);
            val.put(i,(j == null) ? 1 :j+1);
        }
        for(Map.Entry<Integer,Integer> j :val.entrySet()){
            if(j.getValue()>n){
                res.add(j.getKey());
            }
        }
        return res;
}

    public static void main(String[] args) {
        ArrayList<Integer> val = new ArrayList<>();
//        val.add(12);
//        val.add(10);
//        val.add(32);7 4 4 9 7
        val.add(7);
        val.add(4);
        val.add(4);
        val.add(9);
        val.add(7);
        //val.add(2);
        //val.add(3);
//
//
//        List<Integer> res = val.stream().sorted().toList();
//        List<Integer> res1 = val.stream().sorted().toList();
//
//        Optional<Integer> min = val.stream().min(Comparator.naturalOrder());
//        Optional<Integer> max = val.stream().max(Comparator.naturalOrder());
//
//        min.ifPresent(vale -> System.out.println(vale));
//        max.ifPresent(vale -> System.out.println(vale));

//        List<Integer> list = Arrays.asList( 3,11, 12, 2, 5);
//        Integer res2 = list.stream().min(Integer::compare).get();
//
//            System.out.println(res2);
//
//        Integer res3 = list.stream().max(Integer::compare).get();
//
//        System.out.println(res3);
        System.out.println( majorityElementII(val));


    }
}
