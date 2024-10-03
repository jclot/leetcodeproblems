package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        Collections.rotate(list, k);

        for (int i = 0; i < nums.length; i++) {
            nums[i] = list.get(i);
            System.out.print(nums[i]);
        }
    }
}
