package com.leetcode;

import java.util.ArrayList;
import java.util.Random;

public class RandomizedSet {
    ArrayList<Integer> arr = new ArrayList<>();
    Random rand = new Random();


    public RandomizedSet(){
    }

    public boolean insert(int val){
        if (arr.contains(val)) {
            return false; 
        } 
        arr.add(val);
        return true;
    }

    public boolean remove(int val){
        if(!arr.contains(val)) {
            return false; 
        } 
        arr.remove(Integer.valueOf(val));
        return true;
    }


    public int getRandom(){
        int index = rand.nextInt(arr.size());
        return arr.get(index);
    }
}
