package com.fizzbuzz.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> count() {
        List<String> list = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            String fizzBuzzed = evaluateNumber(i);
            list.add(fizzBuzzed);
        }

        System.out.println(list);
        return list;
    }

    public String evaluateNumber(int number) {
        if(number % 3 == 0) {
            if(number % 5 == 0) {
                return "FizzBuzz";
            }
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }

        return String.format("%s", number);
    }
}
