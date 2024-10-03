package com.leetcode;

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] result = new int[m + n];

        for (int i = 0; i < nums1.length; i++) {
            result[i] = nums1[i];
        }

        for (int i = 0; i < nums2.length; i++) {
            result[i + m] = nums2[i];
        }

        for (int i = 0; i < result.length; i++) {
            Arrays.sort(result);
            nums1[i] = result[i];
            System.out.print(nums1[i]);
        }
    }
}
