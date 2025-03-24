package com.self.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class example1 {

    public static List<Integer> removeElement(int[] nums, int val) {
        List<Integer> res = new ArrayList<>();
        for(int i =0; i<nums.length; i++){
            if(  nums[i] != val){
                res.add(nums[i]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
//        List<Integer> val = new ArrayList<>();
//        Set<Integer> val2 = new HashSet<>();
//        val.add(12);
//        val.add(23);
//        val.add(1);
//        val.add(23);
//        val.add(12);
//
//        HashSet<Integer> res = new HashSet<>(val);
//        System.out.println(res);

        int[] arr ={3,2,2,3};
        int val =3;
        List<Integer> res = removeElement(arr, val);
        System.out.println(res);


    }

}
