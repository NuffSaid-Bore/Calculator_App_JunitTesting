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

    // Alternative way of handling multiple numbers
    // public int multiply(List<Integer> numbers) {
    //     int result = 1;
    //     for (int num : numbers) {
    //         result *= num;
    //     }
    //     return result;
    // }

    // Modified multiply to handle multiple numbers
    public static int multiply(int... numbers) {
        int results = 1;
        for (int number : numbers) {
            results *= number;
        }
        return results;
    }
}
