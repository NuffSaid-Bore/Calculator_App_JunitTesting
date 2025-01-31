package com.java.junit;

public class Calculator {

    // public static int add(int a, int b) {
    //     int sum = 0;
    //     sum = a + b;
    //     return sum;
    // }

    // Another way of adding multiple digits in a list
    // public int add(List<Integer> numbers) {
    //     int sum = 1;
    //     for (int num : numbers) {
    //         sum *= num;
    //     }
    //     return sum;
    // }

    // Modified Add Method( Using variable Arguments)
    public static int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int multiply(int a, int b){
        int results = 0;

        results = a * b;
        return results;
    }
}
