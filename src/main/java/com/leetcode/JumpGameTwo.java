package com.leetcode;

public class JumpGameTwo {
    public int jump(int[] nums) {
        int maxPosition = 0;
        int steps = 0;
        int end = 0;
        
        for (int i = 0; i < nums.length - 1; i++) {
            maxPosition = i + nums[i];

            if(i == end) {
                steps++;
                end = maxPosition;
                if(end >= nums.length - 1){
                    break;
                }
            }
        }
        return steps;
    }
}
