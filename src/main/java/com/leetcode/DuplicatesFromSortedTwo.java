package com.leetcode;

public class DuplicatesFromSortedTwo {
    public int removeDuplicatesTwo(int[] nums) {
        int index = 1;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1]) {
                count = 1;
            } else {
                count++;
            }

            if(count <= 2) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
