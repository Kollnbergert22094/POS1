package net.htlgkr.kollnbergert22094;

import java.util.ArrayList;
import java.util.List;

public class EratosthenesPrimeSieve implements PrimeSieve{


    private boolean[] numberList;

    public EratosthenesPrimeSieve(int p) {
        numberList = new boolean[p];
        for (int i = 0; i < numberList.length; i++) {
            numberList[i] = true;
        }
        for (int i = 2; i < numberList.length; i++) {
            if (numberList[i]) {
                for (int j = i; j < numberList.length; j += i) {
                    numberList[i] = false;
                }
            }
        }
    }

    @Override
    public boolean isPrime(int p) {
        return numberList[p];
    }

    @Override
    public void printPrimes() {
        for (int i = 2; i < numberList.length; i++) {
            if (numberList[i]) System.out.println(i);
        }
    }
}