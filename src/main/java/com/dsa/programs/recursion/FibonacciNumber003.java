package com.dsa.programs.recursion;

public class FibonacciNumber003 {

    public static int fib(int n) {
        if(n<=1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        System.out.println("13th term of fibonacci is : " + fib(13));
    }
}
