package com.leetcode;

public class Candy {

    int suma = 0;
    public int candy(int[] ratings) {
        for (int i = 0; i < ratings.length; i++) {
            if (ratings[i] == 0) {
                ratings[i]++;
            }

            if (i < ratings.length - 1 && ratings[i] > ratings[i + 1]) {
                ratings[i]++;
            }

            for (int j = ratings.length - 1; j > i; j--) {
                if(j > i && ratings[j] > ratings[j - 1]){
                    ratings[j]++;
                    break;
                }
            }

            suma += ratings[i];
        }

        return suma;
    }
}
