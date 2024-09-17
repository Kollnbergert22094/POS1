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
    }

    @Override
    public boolean isPrime(int p) {
        return numberList[p];
    }

    @Override
    public void printPrimes() {
        for (int i = 0; i < numberList.length; i++) {
            if (numberList[i]) System.out.println(i);
        }
    }
}