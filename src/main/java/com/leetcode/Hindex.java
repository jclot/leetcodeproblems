package com.leetcode;

import java.util.Arrays;
import java.util.Collections;

public class Hindex {
    public int hIndex(int[] citations){

        Integer[] numsWrapper = Arrays.stream(citations).boxed().toArray(Integer[]::new);
        Arrays.sort(numsWrapper, Collections.reverseOrder());
        citations = Arrays.stream(numsWrapper).mapToInt(Integer::intValue).toArray();

        int index = 0;


        for (int i = 0; i < citations.length; i++) {
            if((i + 1) <= citations[i]){
                index = i + 1;
            } 
        }
        
        return index;
    }
}
