package com.leetcode;

public class ProductOfArray {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];

        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }
        
        int result = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= result;
            result *= nums[i];
        }
        return answer;
    }
}
