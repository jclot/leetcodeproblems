package com.leetcode;

public class MajorityElement {
    public int majorityElement(int[] nums) {

        int maxRep = 0;
        int maxNum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (maxRep == 0) {
                maxNum = nums[i];
                maxRep = 1;
            } else if (nums[i] == maxNum) {
                maxRep++;
            } else {
                maxRep--;
            }
        }
        return maxNum;
    }
}
