package com.leetcode;

public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int result = 0;
        int sumaGas = 0;
        int sumaCost = 0;
        int inicio = 0;
        for (int i = 0; i < gas.length; i++) {
            sumaGas += gas[i];
            sumaCost += cost[i];
            result += gas[i] - cost[i];

            if(result < 0) {
                inicio = i + 1;
                result = 0;
            }
        }
        if(sumaGas >= sumaCost) {
            return inicio;
        } else {
            return -1;
        }
    }
}
