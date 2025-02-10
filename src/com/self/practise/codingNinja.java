package com.self.practise;

import java.util.HashMap;


public class codingNinja {

    public static void main(String[] args) {

        // Most frequent elements in array if equal return 1st occurrences as such
        int[] arr = {1, 2, 3, 1, 2};
      System.out.println(mostFrequentElement(arr)); // Output: 1
    }

    private static int mostFrequentElement(int[] arr) {
        HashMap<Integer,Integer> val = new HashMap<>();
        int count =0;
        int maxElement = -1;

        for(int num: arr){
            val.put(num, val.getOrDefault(num, 0)+1);
            if(val.get(num) > count){
                count = val.get(num);
                maxElement = num;
            }
        }

        for (int num : arr){
            if (val.get(num) == count)
                return num;
        }

        return maxElement;
    }
}
