package net.htlgkr.kollnbergert22094;

import java.util.ArrayList;
import java.util.List;

public class EratosthenesPrimeSieve implements PrimeSieve{


    private List<Integer> numberList;

    public EratosthenesPrimeSieve(int p) {
        for (int i = 2; i < p; i++) {
            numberList.add(i);
        }

    }

    @Override
    public boolean isPrime(int p) {
        return numberList.contains(p);
    }

    @Override
    public void printPrimes() {
        for (int number : numberList) {
            if (isPrime(number)) System.out.println(number);
        }
    }
}